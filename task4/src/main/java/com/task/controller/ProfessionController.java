package com.task.controller;

import com.task.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;

@Controller
public class ProfessionController {
    @Autowired
    ProfessionService professionService;
    @RequestMapping(value = "/u/profession", method = RequestMethod.GET)
    public String find(Model model) {
        HashMap<String, List> listMap = professionService.getListProfession();
        model.addAttribute("listId1", listMap.get("listId1"));
        model.addAttribute("listId2", listMap.get("listId2"));
        model.addAttribute("listId3", listMap.get("listId3"));
        model.addAttribute("listId4", listMap.get("listId4"));
        model.addAttribute("listId5", listMap.get("listId5"));
        return "profession";
    }
}
