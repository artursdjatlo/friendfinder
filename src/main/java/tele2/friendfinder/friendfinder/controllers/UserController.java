package tele2.friendfinder.friendfinder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String page(Model model) {
        return "index";
    }

    @RequestMapping(path = "/profile", method = RequestMethod.GET)
    public String profile(Model model) {
//        String email = SecurityContextHolder.getContext().getAuthentication().getName();
//        User user = userService.findByEmail(email);
//        model.addAttribute("user", user);
        return "register";
    }

    @RequestMapping(path = "/myevents", method = RequestMethod.GET)
    public String myevents(Model model) {
//        String email = SecurityContextHolder.getContext().getAuthentication().getName();
//        User user = userService.findByEmail(email);
//        model.addAttribute("user", user);
        return "myevents";
    }

    @RequestMapping(path = "/myfriends", method = RequestMethod.GET)
    public String myfriends(Model model) {
//        String email = SecurityContextHolder.getContext().getAuthentication().getName();
//        User user = userService.findByEmail(email);
//        model.addAttribute("user", user);
        return "myfriends";
    }

    @RequestMapping(path = "/findfriends", method = RequestMethod.GET)
    public String findfriends(Model model) {
//        String email = SecurityContextHolder.getContext().getAuthentication().getName();
//        User user = userService.findByEmail(email);
//        model.addAttribute("user", user);
        return "findfriends";
    }
}
