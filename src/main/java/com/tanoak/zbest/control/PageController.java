package com.tanoak.zbest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tanoak
 */
@Controller
@RequestMapping("page")
public class PageController {

    //@RequestMapping(value = "/{pageName}",method = RequestMethod.GET)

    @GetMapping("/{pageName}")
    public String toPage(@PathVariable String pageName){

        return pageName;
    }
}
