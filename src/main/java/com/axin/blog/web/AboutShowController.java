package com.axin.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author X9
 * @title: AboutShowController
 * @projectName blog
 * @description: TODO
 * @date 2022/1/19 16:17
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}