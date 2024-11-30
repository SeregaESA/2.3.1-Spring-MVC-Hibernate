package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.User;
import web.servies.UserServiceImpl;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("user", userService.getAll());
        return "users";
    }

    @GetMapping(value = "/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping
    public String createUser(@RequestParam("name") String name, @RequestParam("lastName") String lastName,
                             @RequestParam("age") byte age) {
        userService.save(name, lastName, age);
        return "redirect: /";
    }

    @GetMapping(value = "/edit")
    public String edit(@RequestParam(value = "id") long id, Model model) {
        model.addAttribute("user", userService.getOne(id));
        return "edit";
    }

    @PostMapping(value = "/update")
    public String update(@ModelAttribute("user") User user, @RequestParam("id") long id) {

        userService.update(id, user);
        return "redirect:/";
    }

    @GetMapping(value = "/delete")
    public String delete(@RequestParam("id") long id) {
        userService.delete(id);
        return "redirect:/";
    }
}

