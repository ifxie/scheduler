package com.analysisplatform.service.impl;

import com.analysisplatform.dao.CourseMapper;
import com.analysisplatform.model.Course;
import com.analysisplatform.service.CourseService;
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
public class CourseServiceImpl extends AbstractService<Course> implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Course course)
    {
        List<Course> courses=new ArrayList<Course>();
        courses.add(course);
        courseMapper.insertNoRepeat(courses);
    }

    @Override
    public void saveNoRepeat(List<Course> courses, String schoolId)
    {
        courseMapper.insertNoRepeat(courses);
    }
}
