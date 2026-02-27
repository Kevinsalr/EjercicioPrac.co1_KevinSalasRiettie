/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.service.impl;

import com.salon.salon.domain.Servicio;
import com.salon.salon.repository.ServicioRepository;
import com.salon.salon.service.ServicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> listar() {
        return servicioRepository.findAll();
    }

    @Override
    public void guardar(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public void eliminar(Servicio servicio) {
        servicioRepository.delete(servicio);
    }

    @Override
    public Servicio buscar(Servicio servicio) {
        return servicioRepository.findById(servicio.getId()).orElse(null);
    }
}