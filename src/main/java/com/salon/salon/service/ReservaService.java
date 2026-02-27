package com.salon.salon.service;
import com.salon.salon.domain.Reserva;
import java.util.List;
public interface ReservaService {
    public List<Reserva> listar();
    public void guardar(Reserva reserva);
    public void eliminar(Reserva reserva);
    public Reserva buscar(Reserva reserva);
}