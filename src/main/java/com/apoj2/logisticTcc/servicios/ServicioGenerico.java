package com.apoj2.logisticTcc.servicios;

import java.util.List;

public interface ServicioGenerico<E>{

    public List<E> buscarTodos() throws Exception;
    public E buscarId(Integer id) throws Exception;
    public E registrar(E tabla) throws  Exception;
    public E actulizar(Integer id, E tabla) throws Exception;
    public Boolean borrar(Integer id) throws Exception ;




}
