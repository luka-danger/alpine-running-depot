package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestAboutController {
    @RequestMapping("/guestAbout")
    public String index() {
        return "guestAbout";
    }
}
