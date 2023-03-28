package com.portfolio.Back.portfolioBack.services;

import com.portfolio.Back.portfolioBack.repository.EstudioRepository;
import com.portfolioBack.portfolioBack.model.Estudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {

    @Autowired
    public EstudioRepository estudioRepo;
    
    @Override
    public List<Estudio> obtenerEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio est) {
        estudioRepo.save(est);
    }

    @Override
    public void borrarEstudio(Integer id) {
        estudioRepo.deleteById(id);
    }

    @Override
    public Estudio encontrarEstudio(Integer id) {
        return estudioRepo.findById(id).orElse(null);
    }
    
}
