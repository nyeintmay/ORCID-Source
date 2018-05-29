package org.orcid.core.manager.impl;

import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.orcid.core.manager.ReferenceDataManager;
import org.orcid.persistence.dao.GenericDao;
import org.orcid.persistence.jpa.entities.RefDataEntity;

/**
 * Class to map simple key value pairs of reference org.orcid.test.data for use
 * around app.
 * 
 * @author jamesb
 * 
 */

// TODO - consider making map lazy access/hibernate cached..
public class ReferenceDataManagerImpl implements ReferenceDataManager {

    @Resource(name = "refDataDao")
    private GenericDao<RefDataEntity, Integer> refDataDao;

    @Override
    public Map<String, String> retrieveReferenceDataMap() {

        Map<String, String> refDataMap = new TreeMap<String, String>();
        for (RefDataEntity refData : refDataDao.getAll()) {
            refDataMap.put(String.valueOf(refData.getRefDataEntityKey()), refData.getRefDataEntityValue());
        }

        return refDataMap;
    }

    public String findReferenceDataValueByKey(String key) {

        return retrieveReferenceDataMap().get(key);
    }

    public void setRefDataAboutDao(GenericDao<RefDataEntity, Integer> refDataDao) {
        this.refDataDao = refDataDao;
    }

}
