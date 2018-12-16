package com.example.drCarangoBack.controllers;


import com.example.drCarangoBack.Repository.OficinaRepository;
import com.example.drCarangoBack.Repository.UsuarioRepostiroty;
import com.example.drCarangoBack.entities.Oficina;
import com.example.drCarangoBack.entities.RequestLogin;
import com.example.drCarangoBack.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {



    @GetMapping(value="/oficina/{id}")
    @ResponseBody
    public Oficina getOficina(@PathVariable("id") int id){
        return OficinaRepository.getOficinaById(id);
    }

    @RequestMapping(value="/oficinas/{tipoRanking}")
    @ResponseBody
    public List<Oficina> getoficinas(@PathVariable("tipoRanking") String tipoRanking){
        return OficinaRepository.getOficinas();
    }

    @PostMapping(value="/usuario/login")
    @ResponseBody
    public Usuario Login(@RequestBody RequestLogin request){
        UsuarioRepostiroty.initUsuarios();
        return UsuarioRepostiroty.ValidLogin(request.getEmail(),request.getSenha());
    }
}
