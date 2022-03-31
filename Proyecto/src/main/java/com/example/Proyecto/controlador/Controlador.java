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

    // http://localhost:8080/procesa
    @PostMapping("/procesa")
    public String procesa(HttpServletRequest request, Model model) {
        String nombres = "Axel David García Beltrán \n Camila Alexandra Cruz Miranda \n Fernando Gerardo Flores García \n Ian Israel Garcia Vazquez";
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");
        String nombre3 = request.getParameter("nombre4");
        String nombre4 = request.getParameter("nombre3");
        model.addAttribute("nombre1", nombre1);
        model.addAttribute("nombre2", nombre2);
        model.addAttribute("nombre3", nombre3);
        model.addAttribute("nombre4", nombre4);
        return "nombre";
    }

}
