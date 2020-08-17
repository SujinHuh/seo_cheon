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

    public List<ChartDataVO> getChartData(Map<String, Object> param) throws Exception {
        return mapper.getChartData(param);
    }
}
