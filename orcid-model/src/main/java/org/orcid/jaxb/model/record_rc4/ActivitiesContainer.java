package org.orcid.jaxb.model.record_rc4;

import java.util.Collection;
import java.util.Map;

import org.orcid.jaxb.model.common_rc4.LastModifiedDate;

/**
 * 
 * @author Will Simpson
 * 
 */
public interface ActivitiesContainer {

    Map<Long, ? extends Activity> retrieveActivitiesAsMap();

    Collection<? extends Activity> retrieveActivities();

    void setLastModifiedDate(LastModifiedDate lastModifiedDate);
}
