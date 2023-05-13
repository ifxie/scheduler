package com.analysisplatform.service;
import com.analysisplatform.model.Campus;
import com.analysisplatform.core.Service;

import java.util.List;


/**
 * @author zck
 */
public interface CampusService extends Service<Campus> {

    /**获取同学校ID的所有orginId*/
    public List<String> findAllOriginIdBySchool(String schoolId);

}
