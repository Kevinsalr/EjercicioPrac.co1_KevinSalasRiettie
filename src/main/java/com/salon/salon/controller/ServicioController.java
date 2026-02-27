/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.controller;

import com.salon.salon.domain.Servicio;
import com.salon.salon.service.ServicioService;
import com.salon.salon.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("servicios", servicioService.listar());
        return "servicios/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("servicio", new Servicio());
        model.addAttribute("categorias", categoriaService.listar());
        return "servicios/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Servicio servicio) {
        servicioService.guardar(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Servicio servicio = new Servicio();
        servicio.setId(id);
        servicio = servicioService.buscar(servicio);

        model.addAttribute("servicio", servicio);
        model.addAttribute("categorias", categoriaService.listar());
        return "servicios/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        Servicio servicio = new Servicio();
        servicio.setId(id);
        servicioService.eliminar(servicio);
        return "redirect:/servicios";
    }
}