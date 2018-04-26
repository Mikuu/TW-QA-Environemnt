package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnvironmentController {

    @GetMapping("/env0")
    public String env0() {
        return "environment0";
    }

    @GetMapping("/env1")
    public String env1() {
        return "environment1";
    }

}