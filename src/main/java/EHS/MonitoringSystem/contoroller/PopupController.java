package EHS.MonitoringSystem.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PopupController {

    @GetMapping("popup/graph")
    public ModelAndView graph(@RequestParam(value = "sensorId", required = true) String sensorId) {
        ModelAndView view = new ModelAndView();
        view.setViewName( "popup/graph");
        view.addObject("sensorId", sensorId);
        return view;
    }

}
