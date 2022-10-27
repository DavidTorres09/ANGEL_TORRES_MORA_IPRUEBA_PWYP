/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.service;

import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Lugar;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author angel
 */
@Service
public class LugarService implements ILugarService {
    
    @Autowired
    private LugarRepository lugarRepository;
    
    @Override
    public List<Lugar> listLugar() {
        return (List<Lugar>)lugarRepository.findAll();
    }
    
    
}
