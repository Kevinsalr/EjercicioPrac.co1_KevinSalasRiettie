package com.salon.salon.controller;

import com.salon.salon.domain.Reserva;
import com.salon.salon.service.ReservaService;
import com.salon.salon.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private ServicioService servicioService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", reservaService.listar());
        return "reservas/lista";
    }

    @GetMapping("/nuevo")
    public String nuevaReserva(Model model) {
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("servicios", servicioService.listar());
        return "reservas/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Reserva reserva) {
        reservaService.guardar(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Reserva reserva = new Reserva();
        reserva.setId(id);
        reserva = reservaService.buscar(reserva);

        model.addAttribute("reserva", reserva);
        model.addAttribute("servicios", servicioService.listar());

        return "reservas/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        Reserva reserva = new Reserva();
        reserva.setId(id);
        reservaService.eliminar(reserva);

        return "redirect:/reservas";
    }
}