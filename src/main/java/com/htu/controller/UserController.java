package com.htu.controller;

import com.htu.model.User;
import com.htu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class UserController {

    private User user = new User();

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        User userExist = userService.login(user);
        System.out.println(userExist);
        HttpSession session = request.getSession(true);
        session.setAttribute("userExist",userExist);
        if (userExist != null) {
            if (userExist.getState() == 1) {
                return "payment";
            } else if (userExist.getState() == 2) {
                return "activation";
            } else if (userExist.getState() == 3){
                return "apply";
            } else if (userExist.getState() == 4){
               request.setAttribute("errorMsg","失信状态，不可用");
                return "index";
            } else if (userExist.getState() == 5){
                return "payment";
            }
        }
            request.setAttribute("errorMsg", "输入错误");
            return "index";
    }

    @RequestMapping("/activation")
    public String activation(){
        return "apply";
    }

    @RequestMapping("/apply")
    public String apply(User user){
        userService.update(user);
        return "payment";
    }












}
