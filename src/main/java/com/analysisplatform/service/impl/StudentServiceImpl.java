package com.analysisplatform.service.impl;

import com.analysisplatform.dao.StudentMapper;
import com.analysisplatform.model.Student;
import com.analysisplatform.service.StudentService;
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
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findBoarders() {
        return studentMapper.findBoarders();
    }

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Student student)
    {
        List<Student> students=new ArrayList<Student>();
        students.add(student);
        studentMapper.insertNoRepeat(students);
    }

    @Override
    public void saveNoRepeat(List<Student> students, String schoolId)
    {
        studentMapper.insertNoRepeat(students);
    }


}
