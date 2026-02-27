/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salon.salon.service;

import com.salon.salon.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    public List<Categoria> listar();

    public void guardar(Categoria categoria);

    public void eliminar(Categoria categoria);

    public Categoria buscar(Categoria categoria);
}