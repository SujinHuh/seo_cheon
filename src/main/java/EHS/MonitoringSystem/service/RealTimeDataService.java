package EHS.MonitoringSystem.service;

import EHS.MonitoringSystem.dao.RealTimeDataMapper;
import EHS.MonitoringSystem.vo.RealTimeSensorDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RealTimeDataService {

    @Autowired
    RealTimeDataMapper mapper;

    public List<RealTimeSensorDataVO> getRealTimeData(Map<String, Object> param) throws Exception {
        return mapper.getGatherData(param);
    }
}
