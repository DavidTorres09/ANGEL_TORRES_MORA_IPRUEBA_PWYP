/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.service;

import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Concierto;
import java.util.List;

/**
 *
 * @author angel
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById (long id);
    public void saveCliente(Concierto concierto);
    public void delete (long id);
    
}
