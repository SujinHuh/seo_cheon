package EHS.MonitoringSystem.dao;

import EHS.MonitoringSystem.vo.ChartDataVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ChartDataMapper {

    //온도 차트데이터
    List<ChartDataVO> getTemperChartData(Map<String, Object> param) throws  Exception;
    //풍속차트데이터
    List<ChartDataVO> getWindSpdChartData(Map<String, Object> param) throws  Exception;
}
