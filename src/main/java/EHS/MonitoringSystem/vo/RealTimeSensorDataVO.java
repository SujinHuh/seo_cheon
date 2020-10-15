package EHS.MonitoringSystem.vo;


import lombok.Data;

@Data
public class RealTimeSensorDataVO {

    private String sensorId;
    private String windDir;
    private String windSpeed;
    private String lux;
    private String rHummit;
    private String nowTime;

}
