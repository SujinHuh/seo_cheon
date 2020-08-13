package EHS.MonitoringSystem.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopupController {

    @GetMapping("popup/graph")
    public String graph(Model model) {
        return "popup/graph";
    }

}
