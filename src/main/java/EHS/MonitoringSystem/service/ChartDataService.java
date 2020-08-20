package EHS.MonitoringSystem.service;

import EHS.MonitoringSystem.dao.ChartDataMapper;
import EHS.MonitoringSystem.vo.ChartDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ChartDataService {

    @Autowired
    ChartDataMapper mapper;

    public List<ChartDataVO> getTemperChartData(Map<String, Object> param) throws Exception {
        return mapper.getTemperChartData(param);
    }

    public List<ChartDataVO> getWindSpdChartData(Map<String, Object> param) throws Exception {
        return mapper.getWindSpdChartData(param);
    }
}
