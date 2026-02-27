/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.controller;

import com.salon.salon.domain.Categoria;
import com.salon.salon.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // LISTAR
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("categorias", categoriaService.listar());
        return "categorias/lista";
    }

    // FORM NUEVA
    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categorias/form";
    }

    // GUARDAR
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Categoria categoria) {
        categoriaService.guardar(categoria);
        return "redirect:/categorias";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria = categoriaService.buscar(categoria);

        model.addAttribute("categoria", categoria);
        return "categorias/form";
    }

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoriaService.eliminar(categoria);

        return "redirect:/categorias";
    }
}