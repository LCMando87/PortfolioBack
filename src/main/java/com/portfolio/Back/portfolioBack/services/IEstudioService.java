package com.portfolio.Back.portfolioBack.services;

import com.portfolioBack.portfolioBack.model.Estudio;
import java.util.List;


public interface IEstudioService {
    public List<Estudio> obtenerEstudios ();
    public void crearEstudio(Estudio est);
    public void borrarEstudio(Integer id);
    public Estudio encontrarEstudio(Integer id);
}
