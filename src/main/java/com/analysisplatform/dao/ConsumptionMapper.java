package com.analysisplatform.dao;

import com.analysisplatform.core.Mapper;
import com.analysisplatform.model.Consumption;

import java.util.List;


/**
 * @author zck
 */
public interface ConsumptionMapper extends Mapper<Consumption> {
    /**
     * 按照名字查找消费记录
     * @param name
     * @return
     */
    List<Consumption> findByName(String name);

}