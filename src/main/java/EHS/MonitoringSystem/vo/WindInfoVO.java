package EHS.MonitoringSystem.vo;


import lombok.Data;

@Data
public class WindInfoVO {

    private String sensorid;
    private String winddir;
    private String windspeed;
    private String lux;
    private String rhumidity;
    private String nowTime;

}
