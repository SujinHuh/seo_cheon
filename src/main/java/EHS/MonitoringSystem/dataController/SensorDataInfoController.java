package EHS.MonitoringSystem.dataController;

import EHS.MonitoringSystem.vo.SensorInfoVo;
import EHS.MonitoringSystem.vo.WindInfoVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

//json
@RestController
@RequestMapping("/sensor")
public class SensorDataInfoController {

    @RequestMapping("/getWindInfo")
    public Map<String, Object> getWindInfo(@RequestBody HashMap<String, Object> param) {

        //결과 값 전송 map
        Map<String, Object> resultMap = new HashMap<>();
        List<WindInfoVO> windData = new ArrayList<>(); // 풍속 데이터 리스트

        try {
            //Mock으로 랜덤하게 방향을 정해주기 위한 mockData
            String[] dirs = {"N", "NW", "NE", "W", "E", "S", "SW", "SE"};

            //mockData 만들기
            for (int i = 0; i < 4; i++) {
                WindInfoVO data = new WindInfoVO();
                data.setSensorId("senser" + (i + 1));
                int index = (int) (Math.random() * 8);

                data.setWindDir(dirs[index]);
                data.setWindSpeed(index);

                windData.add(data);
            }
            //  결과 맵에 넣기
            resultMap.put("windInfo", windData);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultMap;
    }

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
                data.setHumidity(index);
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
