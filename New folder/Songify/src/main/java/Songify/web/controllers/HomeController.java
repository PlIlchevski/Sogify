package Songify.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView modelAndView(ModelAndView modelAndView, HttpSession session){
        if (session.getAttribute("email") != null){
            modelAndView.setViewName("redirect:/home");
        } else {
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }

    @GetMapping("/home")
    public ModelAndView home(ModelAndView modelAndView, HttpSession session){
        if (session.getAttribute("email") == null){
            modelAndView.setViewName("redirect:/login");
        } else{
            modelAndView.setViewName("home");
        }

       return modelAndView;

    }
}
