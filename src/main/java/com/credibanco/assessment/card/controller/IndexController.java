package com.credibanco.assessment.card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador de vistas
 *
 * @author jsbuitrago
 */
@Controller
public class IndexController {

  @RequestMapping("/")
  public String getIndexPage() {
    return "CardManagment";
  }
}
