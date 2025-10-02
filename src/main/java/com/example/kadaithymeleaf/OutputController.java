package com.example.kadaithymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        // 入力値を Model に格納
        model.addAttribute("val", val);
        return "output";
    }
}
