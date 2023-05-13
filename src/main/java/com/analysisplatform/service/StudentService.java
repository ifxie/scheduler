package com.analysisplatform.service;
import com.analysisplatform.model.Student;
import com.analysisplatform.core.Service;

import java.util.List;


/**
 * @author zck
 */
public interface StudentService extends Service<Student> {
    /**查找所有住宿生*/
    List<Student> findBoarders();
}
