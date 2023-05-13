package com.analysisplatform.service.impl;

import com.analysisplatform.dao.AttendanceMapper;
import com.analysisplatform.model.Attendance;
import com.analysisplatform.service.AttendanceService;
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
public class AttendanceServiceImpl extends AbstractService<Attendance> implements AttendanceService {
    @Resource
    private AttendanceMapper attendanceMapper;

    @Override
    public void saveNoRepeat(List<Attendance> attendances, String schoolId)
    {
        attendanceMapper.insertNoRepeat(attendances);
    }
    @Override
    public void saveNoRepeat(Attendance attendance)
    {
        List<Attendance> attendances=new ArrayList<Attendance>();
        attendances.add(attendance);
        attendanceMapper.insertNoRepeat(attendances);
    }
}
