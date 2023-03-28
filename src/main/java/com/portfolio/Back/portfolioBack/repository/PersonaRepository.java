package com.portfolio.Back.portfolioBack.repository;

import com.portfolioBack.portfolioBack.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer>{
    
}
