package com.salon.salon.service;

import com.salon.salon.domain.Queja;
import java.util.List;

public interface QuejaService {

    List<Queja> listar();

    void guardar(Queja queja);

    void eliminar(Long id);
}