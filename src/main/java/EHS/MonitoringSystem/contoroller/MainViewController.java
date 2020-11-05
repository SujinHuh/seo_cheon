package EHS.MonitoringSystem.contoroller;


import EHS.MonitoringSystem.service.RealTimeDataService;
import EHS.MonitoringSystem.vo.RealTimeSensorDataVO;
import EHS.MonitoringSystem.vo.WindInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/main/data")
public class MainViewController {
    @Autowired
    private RealTimeDataService realTimeDataService;

    private Logger logger =   LoggerFactory.getLogger(MainViewController.class);

    @RequestMapping("/getWindInfo")
    public Map<String, Object> getWindInfo() {

        //결과 값 전송 map
        Map<String, Object> resultMap = new HashMap<>();
        List<WindInfoVO> windData = new ArrayList<>(); // 풍속 데이터 리스트

        try {
            String[] sensorId = {"id2010", "id2009", "id2010", "id2010"};

            Map<String, Object> param = new HashMap<>();

            for (int i = 0; i < sensorId.length; i++) {
                param.put("sensorId", sensorId[i]);
                WindInfoVO data = realTimeDataService.getMainSensorInfo(param);
                windData.add(data);
            }
            //  결과 맵에 넣기
            resultMap.put("windInfo", windData);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultMap;
    }


    @RequestMapping("/realTimeData")
    public Map<String, Object> getRealTimeData(@RequestParam(name = "startDate", required = true) String startDate,
                                               @RequestParam(name = "endDate",   required = true) String endDate) {


        Map<String, Object> resultMap = new HashMap<>();

        try {

            Map<String, Object> param = new HashMap<>();

            param.put("startDate", startDate);
            param.put("endDate", endDate);

            List<RealTimeSensorDataVO> list = realTimeDataService.getRealTimeData(param);

            if(list == null) {
                list = new ArrayList<>();
            }
            resultMap.put("dataList", list);


        }catch (Exception e) {
            logger.error("Error", e);
            logger.error("Error Get RealTimeData, {}", e.getMessage());
        }


        return resultMap;
    }

}
