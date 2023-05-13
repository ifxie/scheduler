package com.analysisplatform.dao;

import com.analysisplatform.core.Mapper;
import com.analysisplatform.model.Campus;

import java.util.List;

public interface CampusMapper extends Mapper<Campus> {

    List<String> findAllOriginIdBySchoolId(String schoolId);

    /**根据origin_id和origin_school_id 唯一确定值继续宁更新*/
    void updateByOriginIdAndSchoolId(Campus campus);
}