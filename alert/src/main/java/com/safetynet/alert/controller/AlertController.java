package com.safetynet.alert.controller;

import com.safetynet.alert.model.Person;
import com.safetynet.alert.service.AlertService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Data
@Controller
public class AlertController {

  @Autowired
  private AlertService alertService;

  @GetMapping("/")
  public String home(Model model){
    Iterable<Person> listPerson = alertService.getPersons();
    model.addAttribute("persons", listPerson);
    return "persons";
  }

}
