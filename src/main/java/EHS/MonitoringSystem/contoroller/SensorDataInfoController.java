package EHS.MonitoringSystem.contoroller;

import EHS.MonitoringSystem.vo.SensorInfoVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

//json
@RestController
@RequestMapping("/sensor")
public class SensorDataInfoController {

    @RequestMapping("/getSencorDataInfo")
    public Map<String, Object> getSensorDataInfo(@RequestBody HashMap<String, Object> param) {

        // 결과 값 전송 map
        Map<String, Object> resultMap = new HashMap<>();
        // SensorData List
        List<SensorInfoVo> sensorData = new ArrayList<>();

        try {

            //Mock으로 Random
            String[] dcuId = {"DCUID_1", "DCUID_2", "DCUID_3", "DCUID_4", "DCUID_5", "DCUID_6", "DCUID_7", "DCUID_8", "DCUID_9", "DCUID_10"};
            String[] list = {"8", "20", "22.5", "98.5", "5", "4.02", "88", "6.5", "11", "5"};

            //mockData 만들기
            for (int i = 0; i < 11; i++) {
                SensorInfoVo data = new SensorInfoVo();
                data.setSensorId("senser" +(dcuId));
                int index = (int) (Math.random() * 10);
                //current Time
//                String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp());

                data.setTemperature(index);
                data.setRHumidity(index);
                data.setWindDirection(index);
                data.setWindSpeed(index);
                data.setLux(index);
                data.setRawH2(index);
                data.setRawEthanol(index);
                data.setTVoc(index);
                data.setRCVTime(Calendar.getInstance().getTime().toString());

                sensorData.add(data);
            }
            //result put
            resultMap.put("sensorInfo", sensorData);

        } catch (Exception e) {
            e.printStackTrace(); //단계별로 에러를 출력
        }
        return resultMap;

    }
}
