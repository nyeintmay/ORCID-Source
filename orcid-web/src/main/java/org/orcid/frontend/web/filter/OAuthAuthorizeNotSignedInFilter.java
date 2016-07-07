/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.frontend.web.filter;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.orcid.core.manager.impl.OrcidUrlManager;
import org.orcid.frontend.web.controllers.BaseControllerUtil;
import org.springframework.security.core.context.SecurityContext;

/**
 * 
 * @author rcpeters
 * 
 */
public class OAuthAuthorizeNotSignedInFilter implements Filter {

    BaseControllerUtil baseControllerUtil = new BaseControllerUtil();
    
    @Resource
    protected OrcidUrlManager orcidUrlManager;

    @Override
    public void destroy() {
        // Do nothing
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        if (OrcidUrlManager.getPathWithoutContextPath(request).equals("/oauth/authorize")) {
            HttpServletResponse response = (HttpServletResponse) res;
            HttpSession session = request.getSession(false);
            SecurityContext sci = null;
            if (session != null)
                sci = (SecurityContext)session.getAttribute("SPRING_SECURITY_CONTEXT");
            if (baseControllerUtil.getCurrentUser(sci) == null) {
                response.sendRedirect(request.getContextPath() + "/oauth/signin?" + request.getQueryString());
                return;
            }
        }
        chain.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // Do nothing
    }

}
