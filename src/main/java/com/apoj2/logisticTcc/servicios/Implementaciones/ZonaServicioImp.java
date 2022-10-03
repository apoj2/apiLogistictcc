package com.apoj2.logisticTcc.servicios.Implementaciones;

import com.apoj2.logisticTcc.entidades.Zona;
import com.apoj2.logisticTcc.repositorios.Zonarepositorio;
import com.apoj2.logisticTcc.servicios.ServicioGenerico;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ZonaServicioImp implements ServicioGenerico<Zona> {
    @Autowired
    Zonarepositorio zonarepositorio;



    @Override
    public List<Zona> buscarTodos() throws Exception {

        try{
            List<Zona> zonas = zonarepositorio.findAll();
            return zonas;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    @Override
    public Zona buscarId(Integer id) throws Exception {
        try{
            Optional<Zona> zona = zonarepositorio.findById(id);
                    return zona.get();
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    @Override
    public Zona registrar(Zona tabla) throws Exception {
        try{
            tabla=zonarepositorio.save(tabla);
            return tabla;
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    @Override
    public Zona actulizar(Integer id, Zona tabla) throws Exception {
        try{
            Optional<Zona> zonaBuscada = zonarepositorio.findById(id);
            Zona zona = zonaBuscada.get();
            zona = zonarepositorio.save(tabla);
            return zona;
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean borrar(Integer id) throws Exception {
        try{
            if(zonarepositorio.existsById(id)){
                zonarepositorio.deleteById(id);
                return true;
            }else{

                throw new Exception("");
            }
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }
}
