package EHS.MonitoringSystem.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {


    @GetMapping("/settings/coalyardMonitoring")
    public String coalyardMonitorForm(Model model) {
        return "/monitor/monitor";
    }

    //mainPage
    @GetMapping("monitor")
    public String monitor(Model model) {
        return "monitor/monitor";
    }


}
