package com.analysisplatform.dao;

import com.analysisplatform.core.Mapper;
import com.analysisplatform.model.Student;

import java.util.List;

public interface StudentMapper extends Mapper<Student> {
    /**查找所有住宿学生*/
    List<Student> findBoarders();


}