package pl.pozadr.datauiapp.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String getIndex() {
        return "index";
    }
}
