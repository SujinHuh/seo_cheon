package EHS.MonitoringSystem;

import EHS.MonitoringSystem.vo.WindInfoVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sensor")
public class SensorDataInfoController {

    @RequestMapping("/getWindInfo")
    public Map<String, Object> getWindInfo(@RequestBody HashMap<String, Object> param)  {

        //결과 값 전송 map
        Map<String , Object> resultMap = new HashMap<>();
        List<WindInfoVO> windData = new ArrayList<>(); // 풍속 데이터 리스트

        try{
            //가라로 랜덤하게 방향을 정해주기 위한 mockData
            String[] dirs =  {"N", "NW", "NE", "W", "E", "S", "SW", "SE" };

            //mockData 만들기
            for(int i = 0; i < 4; i ++)  {
                WindInfoVO data = new WindInfoVO();
                data.setSensorId( "senser" + (i+1));
                int index = (int)(Math.random() * 8);

                data.setWindDir(dirs[index]);
                data.setWindSpeed(index);

                windData.add(data);
            }
            //  결과 맵에 넣기
            resultMap.put("windInfo", windData);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return resultMap;
    }

}
