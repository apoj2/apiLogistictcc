package com.apoj2.logisticTcc.repositorios;

import com.apoj2.logisticTcc.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Zonarepositorio extends JpaRepository<Zona,Integer> {


}
