package com.example.resume.Controller;

import com.example.resume.ResumeApplication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class resume {
    @GetMapping("/resume")
    public String getPrime(Model model) {
        model.addAttribute("resume", new resume());
        return "index";
    }
    @PostMapping("/about")
    public String about(@ModelAttribute ResumeApplication resumeApplication, BindingResult result, Model model) {
        model.addAttribute("Resume", resumeApplication);
        return "about";
    }
    @PostMapping("/contact")
    public String contact(@ModelAttribute ResumeApplication resumeApplication, BindingResult result, Model model) {
        model.addAttribute("Resume", resumeApplication);
        return "contact";
    }
}