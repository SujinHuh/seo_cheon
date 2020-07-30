package EHS.MonitoringSystem.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {

    @GetMapping("/settings/coalyardMonitoring")
    public String coalyardMonitorForm(Model model) {
        return "/index";
    }
}
