package com.tanoak.zbest.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tanoak
 */
@Controller
@RequestMapping("t")
public class TestController {

    @RequestMapping("1")
    public String to1(Model model ){
        model.addAttribute("aaa","tanoak");
        return "index";
    }
}
