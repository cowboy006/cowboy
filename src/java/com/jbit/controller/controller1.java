package com.jbit.controller;

import com.jbit.entity.DevUser;
import com.jbit.service.Devuserservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/9/4.
 */
@Controller
public class controller1 {
@Resource
private Devuserservice devuserservice;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(DevUser devUser , Model model, HttpSession session){
        DevUser devuserservice.findloging(devUser);
    return "redirect:jsp/developer/main.jsp" ;
    }


}
