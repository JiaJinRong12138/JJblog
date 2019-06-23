package com.blog.controller;

import com.blog.pojo.PojoVO;
import com.blog.pojo.bean.User;
import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ClassName TestController
 * @Author 秃头的JJ
 * Date 2019/6/21 0021 23:39
 * Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BlogService userService;

    @RequestMapping("/get")
    @ResponseBody
    public String getUserTest(HttpSession session) throws Exception {
        User user = new User();
        user.setId(1);
        PojoVO po = new PojoVO();
        po.setUser(user);
        user = userService.getUserById(po);
        session.setAttribute("user", user);
        session.setAttribute("user", user);
        return user.toString();
    }

}
