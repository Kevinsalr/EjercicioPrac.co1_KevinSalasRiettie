/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salon.salon.domain;

import jakarta.persistence.*;

/**
 *
 * @author Kevin PC
 */

@Entity
@Table(name = "categoria")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nombre;
    
    public Categoria() {
        
    }
    
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
