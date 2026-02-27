/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.service.impl;

import com.salon.salon.domain.Categoria;
import com.salon.salon.repository.CategoriaRepository;
import com.salon.salon.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public void guardar(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void eliminar(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    @Override
    public Categoria buscar(Categoria categoria) {
        return categoriaRepository.findById(categoria.getId()).orElse(null);
    }
}