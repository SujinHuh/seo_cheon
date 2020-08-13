package EHS.MonitoringSystem.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlertConfigController {

    @GetMapping("alert/alertconfig")
    public String alter(Model model) {
        return "alert/alertconfig";
    }


}
