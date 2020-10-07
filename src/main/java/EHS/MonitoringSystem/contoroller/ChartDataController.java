package EHS.MonitoringSystem.contoroller;

import EHS.MonitoringSystem.service.ChartDataService;
import EHS.MonitoringSystem.vo.ChartDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/chart")
public class ChartDataController {

    @Autowired
    ChartDataService service;

    @RequestMapping(value = "/chartData")
    public Map<String, Object> getChartData(@RequestParam(name = "startDate", required = true) String startDate,
                                            @RequestParam(name = "endDate", required = true) String endDate,
                                            @RequestParam(name = "sensorId", required = true) String sensorId
    ) {

        Map<String, Object> result = new HashMap<>();
        Map<String, Object> param = new HashMap<>();

        param.put("startDate", startDate);
        param.put("endDate", endDate);
        param.put("sensorId", sensorId);

        List<String> labels = new ArrayList<>();
        List<ChartDataVO> temperDataList = null;
        List<ChartDataVO> windSpdDataList = null;

        List<ChartDataVO> windDirDataList = null;
        List<ChartDataVO> humidityDataList = null;
        List<ChartDataVO> luxDataList = null;


        try {

            temperDataList = service.getTemperChartData(param);
            windSpdDataList = service.getWindSpdChartData(param);

            windDirDataList = service.getWindDirChartData(param);
            humidityDataList = service.getHumidityChartData(param);
            luxDataList = service.getLuxChartData(param);

            if (temperDataList == null || windSpdDataList == null
                    || windDirDataList == null || humidityDataList == null || luxDataList == null) {
                result.put("resultCode", 300);
                result.put("resultMsg", "No chartData");

            } else {
                result.put("resultCode", 200);
                result.put("resultMsg", "No chartData");
            }

            result.put("tempData", temperDataList);
            result.put("windSpdData", temperDataList);  //질문

            result.put("windDirData", temperDataList);
            result.put("humidityData", temperDataList);
            result.put("luxData", temperDataList);

        } catch (Exception e) {
            e.printStackTrace();
            result.put("resultCode", 9999);
            result.put("resultMsg", "Fail get chartData");
        }

        return result;
    }
}
