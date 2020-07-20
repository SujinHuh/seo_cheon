package EHS.MonitoringSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("hi")
    public String index(Model model) {
        model.addAttribute("data","hello");
        return "hi";
    }

}
