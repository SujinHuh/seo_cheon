package EHS.MonitoringSystem.vo;

import lombok.Data;

@Data
public class SensorInfoVo {

    private String sensorId;
    private double temperature;
    private double humidity;
    private double direction;
    private double speed;
    private double lux;
    private double dust;
    private double h2;
    private double co2;
    private double ethanol;
    private double voc;
    private String timestamp;
}
