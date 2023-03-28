package com.portfolioBack.portfolioBack.controller;
import com.portfolio.Back.portfolioBack.services.IEstudioService;
import com.portfolioBack.portfolioBack.model.Estudio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    

//    @GetMapping ("/obtenerEstudios")
//    public String obtenerEstudios(@PathVariable String nombre){
//        if(nombre.length()<6){
//            return "Hola mundo";
//        }else{
//            return "Que nombre largo, pero Hola mundo igual";
//        }
//    }
//
//    @PostMapping ("/new/estudio")
//    public void agregarEstudio(@RequestBody Estudio estudio){
//        
//    }
    

    
    @Autowired
    @Lazy
    private IEstudioService estServ;
    
    @PostMapping ("/new/estudioprueba")
    public String grabarEstudio(@RequestParam Integer id,
                                @RequestParam String estab,
                                @RequestParam Integer personaid,
                                @RequestParam Integer anioDsd,
                                @RequestParam Integer anioHst
    ){
        Estudio est = new Estudio(id, personaid, estab, anioDsd, anioHst);
        estServ.crearEstudio(est);
        return "se guardo correctamente";
    }
}
