package com.portfolio.Back.portfolioBack.services;

import com.portfolioBack.portfolioBack.model.Persona;
import java.util.List;

public interface IPersonaService {
        public List<Persona> obtenerPersonas ();
        public void crearPersona(Persona per);
        public void borrarPersona(Integer id);
        public Persona encontrarPersona(Integer id);
}
