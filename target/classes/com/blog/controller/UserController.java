package com.blog.controller;

import com.blog.pojo.PojoVO;
import com.blog.pojo.bean.User;
import com.blog.service.BlogService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserController
 * @Author 秃头的JJ
 * Date 2019/6/22 0022 12:05
 * Version 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private BlogService blogService;

    private final Logger LOGGER = LogManager.getLogger(UserController.class);

    @PostMapping("/login")
    public String login(User user, HttpSession httpSession, Model model) {
        User u = null;
        try {
            u = blogService.getUserByUsernameAndPassword(new PojoVO(user));
            if((user.getUsername().equals(u.getUsername())) && (user.getPassword().equals(u.getPassword()))){
                LOGGER.info("登陆成功");
                httpSession.setAttribute("user", u);
                return "user";
            }
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
        model.addAttribute("msg", "账户或密码错误");
        return "login";

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "index";
    }



}
