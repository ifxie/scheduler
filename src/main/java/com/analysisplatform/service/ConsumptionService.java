package com.analysisplatform.service;
import com.analysisplatform.model.Consumption;
import com.analysisplatform.core.Service;

import java.util.List;


/**
 * @author zck
 */
public interface ConsumptionService extends Service<Consumption> {
    /**
     * 按照名词找找消费记录
     * @param name
     * @return
     */
    List<Consumption> findByName(String name);


}
