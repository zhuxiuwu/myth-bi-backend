package com.myth.mythbi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myth.mythbi.model.entity.Chart;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @author t
 * @description 针对表【chart(图表信息表)】的数据库操作Mapper
 * @createDate 2023-10-12 19:13:54
 * @Entity com.myth.mythbi.model.entity.Chart
 */
public interface ChartMapper extends BaseMapper<Chart> {

    @MapKey("id")
    List<Map<String, Object>> queryChartData(String querySql);

}




