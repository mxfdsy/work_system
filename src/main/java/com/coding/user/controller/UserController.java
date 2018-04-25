package com.coding.user.controller;

import com.coding.user.entity.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by 没想法的岁月 on 2018/4/25.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/index")
    public String user() {
        User user = new User();
        user.setUsername("没想法的岁月");
        user.setPassword("cww123456");
        user.setMoblie("123456");
        user.setRealName("没想法的岁月");
        return "user";
    }

}
