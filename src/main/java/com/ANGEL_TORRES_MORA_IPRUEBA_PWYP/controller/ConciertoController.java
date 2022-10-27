/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.controller;

import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Artista;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Concierto;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.entity.Lugar;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.service.IArtistaService;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.service.IConciertoService;
import com.ANGEL_TORRES_MORA_IPRUEBA_PWYP.service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author angel
 */
@Controller
public class ConciertoController {
    
    @Autowired
    private IArtistaService artistaService;
    
    @Autowired
    private ILugarService lugarService;
    
    @Autowired
    private IConciertoService conciertoService;
    
    
    //Ver lista
    @GetMapping("/concierto")
    public String Cliente(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("Concierto", listaConcierto);
        return "concierto";
    }
    
    
    //Crear Concierto
    @GetMapping("/conciertoN")
    public String crearCliente(Model model){
        List<Artista> listaArtistas = artistaService.listArtista();
        List<Lugar> listaLugar = lugarService.listLugar();
        
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("artista", listaArtistas);
        model.addAttribute("lugar", listaLugar);

        return "crear";
    }
    
    //Guardar Concierto
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto){
        conciertoService.saveCliente(concierto);
        return "redirect:/concierto";
    }
    
    //Editar Concierto
    @GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id")Long idConcierto, Model model){
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Artista> listaArtistas= artistaService.listArtista();
        List<Lugar> listaLugar= lugarService.listLugar();

        model.addAttribute("concierto", concierto);
        model.addAttribute("artista", listaArtistas);
        model.addAttribute("lugar", listaLugar);

        return "crear";
    }
    
    //Eliminar Concierto
    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto){
        conciertoService.delete(idConcierto);
        return "redirect:/concierto";
    }
    
    
    
    
    
    
    
}
