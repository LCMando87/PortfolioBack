package com.portfolioBack.portfolioBack.model;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    protected Integer personaID;
    private String nombre;
    private String apellido;
    private String acercaDe;
    private String puesto;    
}