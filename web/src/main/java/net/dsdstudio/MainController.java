package net.dsdstudio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by bhkim on 2016. 9. 30..
 */
@Controller
public class MainController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = {"/", "index.html"})
    public String indexPage(Model model) {
        model.addAttribute("message", "이거슨 테스트");
        customerService.test();
        return "index";
    }
}
