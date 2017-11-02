package tele2.friendfinder.friendfinder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManageController {


    @RequestMapping(path = "/manage", method = RequestMethod.GET)
    public String page(Model model) {

        return "manage";
    }


}
