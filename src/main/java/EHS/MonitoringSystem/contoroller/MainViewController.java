package EHS.MonitoringSystem.contoroller;


import EHS.MonitoringSystem.service.RealTimeDataService;
import EHS.MonitoringSystem.vo.RealTimeSensorDataVO;
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
