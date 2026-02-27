/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 *
 * @author Kevin PC
 */
@Entity
@Table(name = "servicio")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private BigDecimal precio;
    
    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;
    
    public Servicio() {
        
    }
    
    public Long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public BigDecimal getPrecio() {
        return precio;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
