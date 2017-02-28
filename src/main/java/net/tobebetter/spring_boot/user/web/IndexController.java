package net.tobebetter.spring_boot.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhang on 2017/2/28.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host", "abc");
        return "index";
    }
}
