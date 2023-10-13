package com.myth.mythbi.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 易小川
 * @version 1.0
 */
@SpringBootTest
class ChartMapperTest {
    @Resource
    private ChartMapper chartMapper;

    @Test
    void queryChartData() {
        List<Map<String, Object>> maps = chartMapper.queryChartData("select * from chart_1712635414894628865");
        System.out.println(maps);
    }
}