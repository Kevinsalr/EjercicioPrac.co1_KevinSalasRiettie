/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salon.salon.service;

import com.salon.salon.domain.Servicio;
import java.util.List;

public interface ServicioService {

    public List<Servicio> listar();

    public void guardar(Servicio servicio);

    public void eliminar(Servicio servicio);

    public Servicio buscar(Servicio servicio);
}