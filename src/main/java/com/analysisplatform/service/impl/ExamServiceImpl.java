package com.analysisplatform.service.impl;

import com.analysisplatform.dao.ExamMapper;
import com.analysisplatform.model.Exam;
import com.analysisplatform.service.ExamService;
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
public class ExamServiceImpl extends AbstractService<Exam> implements ExamService {
    @Resource
    private ExamMapper examMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Exam exam)
    {
        List<Exam> exams=new ArrayList<Exam>();
        exams.add(exam);
        examMapper.insertNoRepeat(exams);
    }

    @Override
    public void saveNoRepeat(List<Exam> exams, String schoolId)
    {
        examMapper.insertNoRepeat(exams);
    }
}
