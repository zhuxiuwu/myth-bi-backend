package com.myth.mythbi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.myth.mythbi.model.dto.chart.ChartQueryRequest;
import com.myth.mythbi.model.entity.Chart;

/**
* @author t
* @description 针对表【chart(图表信息表)】的数据库操作Service
* @createDate 2023-10-12 19:13:54
*/
public interface ChartService extends IService<Chart> {

    /**
     * 获取查询条件
     *
     * @param chartQueryRequest
     * @return
     */
    QueryWrapper<Chart> getQueryWrapper(ChartQueryRequest chartQueryRequest);

}
