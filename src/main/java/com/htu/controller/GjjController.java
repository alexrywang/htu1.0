package com.htu.controller;

import com.htu.model.Usergjj;
import com.htu.service.GjjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class GjjController {

    private Usergjj usergjj=new Usergjj();

   @Autowired
    private GjjService gjjService;
    public void setGjjService(GjjService gjjService) {
        this.gjjService = gjjService;
   }


   @RequestMapping("/gjjindex")
   public String index(){
        return "gjjindex";
   }

   @RequestMapping("/gjjlogin")
   public String login(Usergjj usergjj, HttpServletRequest request) {
        Usergjj userExist = gjjService.login(usergjj);
        System.out.println(userExist);
        if (userExist==null){
           request.setAttribute("errorMsg","输入错误");
           return "gjjindex";
       }else{
            HttpSession session = request.getSession(true);
            session.setAttribute("userExist",userExist);
            Usergjj u = (Usergjj)session.getAttribute("userExist");
            System.out.println(u.getKhsfzhm());
            List<Usergjj> list = gjjService.findByidcard(u.getKhsfzhm());
            System.out.println(list);
            session.setAttribute("list",list);
            return "gjjlist";
        }

  }

}







//    @RequestMapping("/")
//    public ModelAndView login(){
//
//         ModelAndView mv = new ModelAndView();
//         mv.setViewName("login");
//
//         return mv;
//    }