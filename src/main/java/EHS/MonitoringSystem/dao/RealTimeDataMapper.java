package EHS.MonitoringSystem.dao;


import EHS.MonitoringSystem.vo.RealTimeSensorDataVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface RealTimeDataMapper {
    /**
     * 센서별 실시간 수집데이터 가져오기
     * 5분단위
     * @param param
     * @return
     * @throws Exception
     */
    List<RealTimeSensorDataVO> getGatherData(Map<String, Object> param) throws  Exception;
}
