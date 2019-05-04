package Songify.web.controllers;

import Songify.domain.models.binding.AddSongBindingModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class SongController {

    @GetMapping("/addSong")
    public ModelAndView songs(ModelAndView modelAndView, HttpSession session){
        if (session.getAttribute("email") == null){
            modelAndView.setViewName("redirect:/login");
        } else {
            modelAndView.setViewName("addSong");
        }
        return modelAndView;
    }

    @PostMapping("/addSong")
    public ModelAndView songConfirm(@ModelAttribute AddSongBindingModel model, ModelAndView modelAndView){
        modelAndView.setViewName("");

        return modelAndView;
    }

}
