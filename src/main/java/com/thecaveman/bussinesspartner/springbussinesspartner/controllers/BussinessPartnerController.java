package com.thecaveman.bussinesspartner.springbussinesspartner.controllers;

import com.thecaveman.bussinesspartner.springbussinesspartner.model.BussinessPartner;
import com.thecaveman.bussinesspartner.springbussinesspartner.service.BussinessPartnerService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BussinessPartnerController {
    @Autowired
    private BussinessPartnerService service;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<BussinessPartner> bussinessPartners = service.getPartner();
        model.addAttribute("listOfPartners", bussinessPartners);
        return "index";
    }

    @RequestMapping("/newPartner")
    public String addPartner(Model model){
        BussinessPartner bussinessPartner = new BussinessPartner();
        model.addAttribute("newPartner",bussinessPartner);
        return "new_partner";
    }

    @RequestMapping(value = "/savePartner", method = RequestMethod.POST)
    public String savePartner(@ModelAttribute("partner") BussinessPartner partner){
        service.save(partner);
        return "redirect:/";
    }

    /*@RequestMapping("/edit/{id}")
    public ModelAndView editPartnerFromId(@PathVariable(name="id") long id){
        ModelAndView modelAndView = new ModelAndView("edit_partner");
        BussinessPartner bussinessPartner = service.getPartnerById(id);
        modelAndView.addObject("partner",bussinessPartner);
        return modelAndView;
    }*/
    @RequestMapping("/edit/{id}")
    public String updatePartnerFromId(@PathVariable(name = "id") long id,Model model){
        BussinessPartner bussinessPartner = service.getPartnerById(id);
        model.addAttribute("partner", bussinessPartner);
        return "update_partner";
    }

    @RequestMapping("/delete/{id}")
    public String deletePartnerById(@PathVariable("id")long id){
        service.deletePartnerById(id);
        return "redirect:/";
    }
}
