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
        List<ChartDataVO> airTemperDataList = null;
        List<ChartDataVO> windSpdDataList = null;

        List<ChartDataVO> windDirDataList = null;
        List<ChartDataVO> rHumidityDataList = null;
        List<ChartDataVO> luxDataList = null;
        List<ChartDataVO> airPressureDataList = null;
        List<ChartDataVO> vBatDataList = null;

        try {

            airTemperDataList = service.getAirTemperChartData(param);
            windSpdDataList = service.getWindSpdChartData(param);

            windDirDataList = service.getWindDirChartData(param);
            rHumidityDataList = service.getRHumidityChartData(param);
            luxDataList = service.getLuxChartData(param);
            airPressureDataList = service.getAirPressureChartData(param);
            vBatDataList = service.getVBatChartData(param);

            if (airTemperDataList == null || windSpdDataList == null
                    || windDirDataList == null || rHumidityDataList == null || luxDataList == null
                    || airPressureDataList == null || vBatDataList == null) {
                result.put("resultCode", 300);
                result.put("resultMsg", "No chartData");

            } else {
                result.put("resultCode", 200);
                result.put("resultMsg", "No chartData");
            }

            result.put("airTemperData", airTemperDataList);  // airTempData --> airTemperData
            result.put("windSpdData", windSpdDataList);

            result.put("windDirData", windDirDataList);
            result.put("rHumidityData", rHumidityDataList);
            result.put("luxData", luxDataList);
            result.put("airPressureData",airPressureDataList);
            result.put("vBatData", vBatDataList);

        } catch (Exception e) {
            e.printStackTrace();
            result.put("resultCode", 9999);
            result.put("resultMsg", "Fail get chartData");
        }

        return result;
    }
}
