package EHS.MonitoringSystem.vo;


import lombok.Data;

@Data
public class WindInfoVO {

    private String sensorId;
    private String windDir;
    private double windSpeed;

}
