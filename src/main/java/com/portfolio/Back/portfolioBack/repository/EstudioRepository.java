package com.portfolio.Back.portfolioBack.repository;

import com.portfolioBack.portfolioBack.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Integer>{
    
}
