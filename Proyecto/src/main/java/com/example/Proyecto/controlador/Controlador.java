package com.example.Proyecto.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controlador {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/procesa")
    public String procesa(HttpServletRequest request, Model model ) {
        String nota = request.getParameter("nota");
        model.addAttribute("nota", nota);
        return "nombre";
    }

}
