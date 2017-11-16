package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Project: ssmDemo
 * FileName: UserController
 * Created By IntelliJ IDEA
 * Author Mr.XIE
 * Date: 2017/11/16
 * Time: 9:57
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    public String index(HttpServletRequest httpServletRequest,Model model)
    {
        int userId = Integer.parseInt(httpServletRequest.getParameter("userId"));
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        return "test";
    }
}
