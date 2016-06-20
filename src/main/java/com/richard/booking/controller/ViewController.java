package com.richard.booking.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author richard
 */
@Controller
public class ViewController {
    
    //@Value("${app-mode}")
    private String appMode;

    public ViewController(Environment environment) {
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Richard");
        model.addAttribute("mode", appMode);
        
        return "index";
    }

}
