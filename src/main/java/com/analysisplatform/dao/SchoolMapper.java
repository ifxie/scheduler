package com.analysisplatform.dao;

import com.analysisplatform.core.Mapper;
import com.analysisplatform.model.School;


public interface SchoolMapper extends Mapper<School> {
    public School findByUsername(String username);


}