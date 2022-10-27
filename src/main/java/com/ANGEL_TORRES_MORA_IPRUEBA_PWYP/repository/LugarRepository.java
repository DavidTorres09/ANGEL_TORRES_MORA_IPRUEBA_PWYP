/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.repository;

import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Lugar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angel
 */

@Repository
public interface LugarRepository extends CrudRepository<Lugar,Long>{
    
}
