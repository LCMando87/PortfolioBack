package com.portfolioBack.portfolioBack.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer estudioID;
    
    private Integer personaID;
    private String establecimiento;
    private Integer anoDesde;
    private Integer anoHasta;

    public Estudio(Integer estudioID, Integer personaID, String establecimiento, Integer anoDesde, Integer anoHasta) {
        this.estudioID = estudioID;
        this.personaID = personaID;
        this.establecimiento = establecimiento;
        this.anoDesde = anoDesde;
        this.anoHasta = anoHasta;
    }
    
    
}
