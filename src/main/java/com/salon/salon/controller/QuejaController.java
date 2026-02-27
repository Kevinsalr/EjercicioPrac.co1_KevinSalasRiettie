package com.salon.salon.controller;

import com.salon.salon.domain.Queja;
import com.salon.salon.service.QuejaService;
import com.salon.salon.service.ServicioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quejas")
public class QuejaController {

    private final QuejaService quejaService;
    private final ServicioService servicioService;

    public QuejaController(QuejaService quejaService,
                           ServicioService servicioService) {
        this.quejaService = quejaService;
        this.servicioService = servicioService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("quejas", quejaService.listar());
        return "quejas/lista";
    }

    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("queja", new Queja());
        model.addAttribute("servicios", servicioService.listar());
        return "quejas/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Queja queja) {
        quejaService.guardar(queja);
        return "redirect:/quejas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        quejaService.eliminar(id);
        return "redirect:/quejas";
    }
}