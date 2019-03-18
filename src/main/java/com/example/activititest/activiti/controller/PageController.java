package com.example.activititest.activiti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hollis on 2018/3/14.
 */
@Controller
public class PageController {
    @GetMapping("editor")
    public String test(){
        return "/modeler";
    }
}
