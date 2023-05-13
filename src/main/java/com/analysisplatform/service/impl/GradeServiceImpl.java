package com.analysisplatform.service.impl;

import com.analysisplatform.dao.GradeMapper;
import com.analysisplatform.model.Grade;
import com.analysisplatform.service.GradeService;
import com.analysisplatform.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author zck
 */
@Service
@Transactional
public class GradeServiceImpl extends AbstractService<Grade> implements GradeService {
    @Resource
    private GradeMapper gradeMapper;


    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Grade grade)
    {
        List<Grade> grades=new ArrayList<Grade>();
        grades.add(grade);
        gradeMapper.insertNoRepeat(grades);
    }

    @Override
    public void saveNoRepeat(List<Grade> grades, String schoolId)
    {
        gradeMapper.insertNoRepeat(grades);
    }
}
