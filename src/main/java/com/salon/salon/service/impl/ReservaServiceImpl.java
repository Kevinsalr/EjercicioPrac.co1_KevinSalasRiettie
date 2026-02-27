/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.service.impl;

import com.salon.salon.domain.Reserva;
import com.salon.salon.repository.ReservaRepository;
import com.salon.salon.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> listar() {
        return reservaRepository.findAll();
    }

    @Override
    public void guardar(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public void eliminar(Reserva reserva) {
        reservaRepository.delete(reserva);
    }

    @Override
    public Reserva buscar(Reserva reserva) {
        return reservaRepository.findById(reserva.getId()).orElse(null);
    }
}