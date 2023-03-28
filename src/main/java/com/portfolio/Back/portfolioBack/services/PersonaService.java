package com.portfolio.Back.portfolioBack.services;

import com.portfolio.Back.portfolioBack.repository.PersonaRepository;
import com.portfolioBack.portfolioBack.model.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> obtenerPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Integer id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);
    }

}
