/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.service;

import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Artista;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author angel
 */
@Service
public class ArtistaService implements IArtistaService{
    
    @Autowired
    private ArtistaRepository artistaRepository;
    
    @Override
    public List<Artista> listArtista() {
        return (List<Artista>)artistaRepository.findAll();
    }
    
}
