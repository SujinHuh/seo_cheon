package EHS.MonitoringSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("hi")
    public String index(Model model) {
//        model.addAttribute("data","hello");
        return "hi";
    }


    @GetMapping("monitor")
    public String monitor(Model model) {
        return "monitor/monitor";
    }

    @GetMapping("alert/alertconfig")
    public String alter(Model model) {
        return "alert/alertconfig";
    }

    @GetMapping("alert/alertconfigEx")
    public String alterEx(Model model) {
        return "alert/alertconfigEx";
    }


    @GetMapping("popup/graph")
    public String graph(Model model) {
        return "popup/graph";
    }

    @GetMapping("popup/alert")
    public String alert(Model model) {
        return "popup/alert";
    }
}
