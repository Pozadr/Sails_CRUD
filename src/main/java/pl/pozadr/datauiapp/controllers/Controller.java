package pl.pozadr.datauiapp.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pozadr.datauiapp.models.Sail;
import pl.pozadr.datauiapp.services.SailService;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
    private SailService sailService;

    public Controller(SailService sailService) {
        this.sailService = sailService;
    }

    @GetMapping("/sails")
    public String getSails(Model model) {
        model.addAttribute("sails", sailService.getSails());
        return "sails";
    }

    @GetMapping("/sails-by-id")
    @ResponseBody
    public Optional<Sail> getSailById(Integer id, Model model) {
        return sailService.getSailById(id);
    }

    @RequestMapping(value = "/update-sail", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET})
    public String saveSail(Sail sail) {
        sailService.updateSail(sail);
        return "redirect:sails";
    }

    @RequestMapping(value = "/add-new-sail", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET})
    public String addNewSail(Sail sail) {
        sailService.addSail(sail);
        return "redirect:sails";
    }

    @RequestMapping(value = "/delete-sail", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET})
    public String deleteSail(Integer id) {
        sailService.deleteSail(id);
        return "redirect:sails";
    }
}
