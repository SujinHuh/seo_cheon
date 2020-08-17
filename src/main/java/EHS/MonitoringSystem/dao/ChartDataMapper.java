package EHS.MonitoringSystem.dao;

import EHS.MonitoringSystem.vo.ChartDataVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ChartDataMapper {

    List<ChartDataVO> getChartData(Map<String, Object> param) throws  Exception;
}
