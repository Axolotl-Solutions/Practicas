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
        String nombres=" Axel David García Beltrán\n Camila Alexandra Cruz Miranda 316084707\n Fernando Gerardo Flores García\nIan Israel Garcia Vazquez";
        String nombre = request.getParameter("nombre");
        System.out.println("nombre -> " + nombre+"\n"+nombres);
        model.addAttribute("nombre", nombre);
        return "nombre";

    }

}
