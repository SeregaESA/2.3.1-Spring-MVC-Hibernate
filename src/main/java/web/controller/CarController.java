package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm car");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "cars";
    }

    @GetMapping(value = "/new")
    public String getCars(ModelMap model) {
        model.addAttribute("something", "this is coming from controller");
        return "new";
    }

}
