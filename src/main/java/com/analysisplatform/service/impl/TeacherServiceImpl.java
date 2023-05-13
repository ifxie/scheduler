package com.analysisplatform.service.impl;

import com.analysisplatform.dao.TeacherMapper;
import com.analysisplatform.model.Teacher;
import com.analysisplatform.service.TeacherService;
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
public class TeacherServiceImpl extends AbstractService<Teacher> implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Teacher teacher)
    {
        List<Teacher> teachers=new ArrayList<Teacher>();
        teachers.add(teacher);
        teacherMapper.insertNoRepeat(teachers);

    }

    @Override
    public void saveNoRepeat(List<Teacher> teachers, String schoolId)
    {
        teacherMapper.insertNoRepeat(teachers);
    }

}
