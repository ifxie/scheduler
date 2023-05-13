package com.analysisplatform.service.impl;

import com.analysisplatform.dao.ConsumptionMapper;
import com.analysisplatform.model.Consumption;
import com.analysisplatform.service.ConsumptionService;
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
public class ConsumptionServiceImpl extends AbstractService<Consumption> implements ConsumptionService {
    @Resource
    private ConsumptionMapper consumptionMapper;

    @Override
    public List<Consumption> findByName(String name) {
        return consumptionMapper.findByName(name);
    }


    /**
     * 功能：对新旧数据进行筛选
     *      旧数据Update
     *      新数据insert
     * @Return void
     * */
    @Override
    public void saveNoRepeat(Consumption consumption)
    {
        List<Consumption> consumptions=new ArrayList<Consumption>();
        consumptions.add(consumption);
        consumptionMapper.insertNoRepeat(consumptions);
    }

    @Override
    public void saveNoRepeat(List<Consumption> consumptions, String schoolId)
    {
        consumptionMapper.insertNoRepeat(consumptions);
    }
}
