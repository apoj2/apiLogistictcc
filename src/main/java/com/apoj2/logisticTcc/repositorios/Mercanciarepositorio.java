package com.apoj2.logisticTcc.repositorios;

import com.apoj2.logisticTcc.entidades.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mercanciarepositorio extends JpaRepository<Mercancia,Integer> {
    //clase que tiene solo metodos




}
