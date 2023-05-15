package com.aston.service.impl;

import com.aston.dao.TbCronMapper;
import com.aston.model.TbCron;
import com.aston.service.TbCronService;
import com.aston.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author zck
 */
@Service
@Transactional
public class TbCronServiceImpl extends AbstractService<TbCron> implements TbCronService {
    @Resource
    private TbCronMapper tbCronMapper;

    @Override
    public void saveNoRepeat(List<TbCron> tbCrons, String schoolId) {

    }

    @Override
    public void saveNoRepeat(TbCron tbCron) {

    }
}
