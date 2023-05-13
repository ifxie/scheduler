package com.analysisplatform.service;
import com.analysisplatform.model.School;
import com.analysisplatform.core.Service;

import java.util.List;


/**
 * @author zck
 */
public interface SchoolService extends Service<School> {
    School findByUsername(String username);

//    public void saveNoRepeat(List<School> schools);
//    public void saveNoRepeat(School school);
}
