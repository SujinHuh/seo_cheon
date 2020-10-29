package EHS.MonitoringSystem.vo;

import lombok.Data;

@Data
public class SensorInfoVo {

    private String sensorId;
    private int windDirection;
    private int windSpeed;
    private double temperature;
    private double rHumidity;
    private double absHumidity;
    private double lux;
    private int tVoc;
    private int eCO2;
    private int rawH2;
    private int rawEthanol;
    private int tVOCbase;
    private int eCO2base;
//    private float mc1p0;
//    private float mc2p5;
//    private float mc4p0;
//    private float mc10p0;
//    private float nc0p5;
//    private float nc1p0;
//    private float nc2p5;
//    private float nc4p0;
//    private float nc10p0;
//    private float typPsize;
    private String RCVTime;

}
