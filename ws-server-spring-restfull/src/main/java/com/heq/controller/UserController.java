package com.heq.controller;

import com.heq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 16:30
 * Description : No Description
 * version : 1.0
 */
@Controller
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public String queryUser(Model model) {
        model.addAttribute("msg",userService.queryUser());
        return "user";
    }

}
