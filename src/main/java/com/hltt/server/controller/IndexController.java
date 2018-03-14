package com.hltt.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("")
    public String index() {
        System.out.print("ssssssaaasssssssssssssssssssss");
        return "index";
    }
//    @RequestMapping(value = "save",method = RequestMethod.POST)
//    public String Save(@ModelAttribute("form") User user, Model model) { // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
//        model.addAttribute("user", user);
//        return "/detail";
////        return  new ModelAndView("detail");
//    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String Save(String id,String name, Model model) { // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
//        model.addAttribute("user", user);
        System.out.print("sssssssssssssssssssssssss");
        return "detail";
//        return  new ModelAndView("detail");
    }
}
