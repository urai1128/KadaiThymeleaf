package com.example.kadaithymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous,
                           Model model) {
        // 前回の入力値を受け取って Model に格納
        model.addAttribute("previous", previous);
        return "input";
    }
}

