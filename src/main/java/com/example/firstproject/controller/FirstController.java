package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "안녕");
        return "greetings"; //templates/greetings.mustaches -> 브라우저로 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","서일");
        return "goodbye"; //templates/greetings.mustaches -> 브라우저로 전송
    }
}
