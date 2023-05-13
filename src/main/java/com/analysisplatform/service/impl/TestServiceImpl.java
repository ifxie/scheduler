package com.analysisplatform.service.impl;

import com.analysisplatform.dao.TestMapper;
import com.analysisplatform.model.Test;
import com.analysisplatform.service.TestService;
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
public class TestServiceImpl extends AbstractService<Test> implements TestService {
    @Resource
    private TestMapper testMapper;

    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Test test)
    {
        List<Test> tests=new ArrayList<Test>();
        tests.add(test);
        testMapper.insertNoRepeat(tests);
    }

    @Override
    public void saveNoRepeat(List<Test> tests, String schoolId)
    {
        testMapper.insertNoRepeat(tests);
    }
}
