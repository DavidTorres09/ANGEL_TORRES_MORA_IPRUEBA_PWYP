/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.repository;

import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angel
 */
@Repository
public interface ArtistaRepository extends CrudRepository<Artista,Long>{
    
    
    
}
