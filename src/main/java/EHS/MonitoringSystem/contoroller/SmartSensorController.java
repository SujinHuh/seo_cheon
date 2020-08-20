package EHS.MonitoringSystem.contoroller;

import EHS.MonitoringSystem.service.SmartSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smart")
public class SmartSensorController {

    @Autowired
    SmartSensorService service;

    @RequestMapping(value = "/smartSensor")
    public void getSmartSensorText(){

    }

}
