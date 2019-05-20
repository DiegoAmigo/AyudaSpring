package com.ejemplo.ejemplo.Services;

import java.util.ArrayList;

import com.ejemplo.ejemplo.Models.ModeloEjemplo;

import org.springframework.stereotype.Service;

//practicamente el servicio hace todas las operaciones (lo mismo en el respositorio al parecer)

@Service
public class ServicioEjemplo{
    private ArrayList<ModeloEjemplo> lista = new ArrayList<ModeloEjemplo>();
    
    public ArrayList<ModeloEjemplo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ModeloEjemplo> lista) {
        this.lista = lista;
    }

    public ModeloEjemplo buscar(String id){
        int largo = lista.size();
        int esperado=0;
        for(int i=0;i<largo;i++){
            if(lista.get(i).getId().equals(id)){
                esperado=i;
                i=i+largo;
            }
        }
        return lista.get(esperado);
    }

    public void agregarElem(ModeloEjemplo ejemplo){
        lista.add(ejemplo);
    }

    public ModeloEjemplo actualizarEjem(ModeloEjemplo ejemplo, String id){
        int largo = lista.size();
        int objetivo=0;
        for(int i=0;i<largo;i++){
            if(lista.get(i).getId().equals(id)){
                objetivo=i;
                lista.get(i).setId(ejemplo.getId());
                lista.get(i).setNombre(ejemplo.getNombre());
                i=i+largo;
            }
        }
        return lista.get(objetivo);
    }
}