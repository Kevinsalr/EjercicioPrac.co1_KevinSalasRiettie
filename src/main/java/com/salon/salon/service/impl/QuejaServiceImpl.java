/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.service.impl;

import com.salon.salon.domain.Queja;
import com.salon.salon.repository.QuejaRepository;
import com.salon.salon.service.QuejaService;  // ← ESTA LÍNEA FALTABA
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuejaServiceImpl implements QuejaService {

    private final QuejaRepository quejaRepository;

    public QuejaServiceImpl(QuejaRepository quejaRepository) {
        this.quejaRepository = quejaRepository;
    }

    @Override
    public List<Queja> listar() {
        return quejaRepository.findAll();
    }

    @Override
    public void guardar(Queja queja) {
        quejaRepository.save(queja);
    }

    @Override
    public void eliminar(Long id) {
        quejaRepository.deleteById(id);
    }
}