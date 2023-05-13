package com.analysisplatform.service.impl;

import com.analysisplatform.dao.SchoolMapper;
import com.analysisplatform.model.School;
import com.analysisplatform.service.SchoolService;
import com.analysisplatform.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author zck
 */
@Service
@Transactional
public class SchoolServiceImpl extends AbstractService<School> implements SchoolService {
    @Resource
    private SchoolMapper schoolMapper;

    @Override
    public School findByUsername(String username) {
        School school=schoolMapper.findByUsername(username);
        return school;
    }



    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(School school)
    {

    }

    @Override
    public void saveNoRepeat(List<School> schools, String schoolId)
    {

    }
}
