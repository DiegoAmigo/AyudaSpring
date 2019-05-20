package com.ejemplo.ejemplo.Controllers;

import java.util.ArrayList;

import com.ejemplo.ejemplo.Models.ModeloEjemplo;
import com.ejemplo.ejemplo.Services.ServicioEjemplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador{
    
    @Autowired
    private ServicioEjemplo ejemplo;

    @RequestMapping("/caca") //esto es un get
    public ArrayList<ModeloEjemplo> caca() { 
        return ejemplo.getLista();
    }
    @GetMapping("/caca/{id}")
    public ModeloEjemplo obtener(@PathVariable String id){
        return ejemplo.buscar(id);
    }
    @PostMapping("/caca") //con request body spring espera un json asi que ojo ahí
    public void agregarEjemplo(@RequestBody ModeloEjemplo ejemplo2){
        ejemplo.agregarElem(ejemplo2);
    }
}