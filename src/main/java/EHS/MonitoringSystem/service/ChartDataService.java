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

    public List<ChartDataVO> getAirTemperChartData(Map<String, Object> param) throws Exception {
        return mapper.getAirTemperChartData(param);
    }

    public List<ChartDataVO> getWindSpdChartData(Map<String, Object> param) throws Exception {
        return mapper.getWindSpdChartData(param);
    }

    public List<ChartDataVO> getWindDirChartData(Map<String, Object> param) throws Exception {
        return mapper.getWindDirChartData(param);
    }

    public List<ChartDataVO> getRHumidityChartData(Map<String, Object> param) throws Exception {
        return mapper.getRHumidityChartData(param);
    }

    public List<ChartDataVO> getLuxChartData(Map<String, Object> param) throws Exception {
        return mapper.getLuxChartData(param);
    }

    public List<ChartDataVO> getAirPressureChartData(Map<String, Object> param) throws Exception {
        return mapper.getAirPressureChartData(param);
    }

    public List<ChartDataVO> getVBatChartData(Map<String, Object> param) throws Exception {
        return mapper.getVBatChartData(param);
    }
}

