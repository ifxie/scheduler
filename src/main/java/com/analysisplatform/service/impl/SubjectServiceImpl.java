package com.analysisplatform.service.impl;

import com.analysisplatform.dao.SubjectMapper;
import com.analysisplatform.model.Subject;
import com.analysisplatform.service.SubjectService;
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
public class SubjectServiceImpl extends AbstractService<Subject> implements SubjectService {
    @Resource
    private SubjectMapper subjectMapper;


    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Subject subject)
    {
        List<Subject> subjects=new ArrayList<Subject>();
        subjects.add(subject);
        subjectMapper.insertNoRepeat(subjects);

    }

    @Override
    public void saveNoRepeat(List<Subject> subjects, String schoolId)
    {
        subjectMapper.insertNoRepeat(subjects);
    }
}
