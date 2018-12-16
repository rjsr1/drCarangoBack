package com.example.drCarangoBack.controllers;


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



    @RequestMapping(value="/oficinas/{tipoRanking}")
    @ResponseBody
    public List<Oficina> getoficinas(@PathVariable("tipoRanking") String tipoRanking){
        Oficina of1 = new Oficina("BiAuto","Rua Raul pompeia, 294, Arruda, Recife","9999999999","sem promoções");
        Oficina of2 = new Oficina("Seu carro","Rua Raul pompeia, 294, Arruda, Recife","9999999999","sem promoções");
        Oficina of3 = new Oficina("Seu carro","Rua Raul pompeia, 294, Arruda, Recife","9999999999","sem promoções");
        Oficina of4 = new Oficina("Seu carro","Rua Raul pompeia, 294, Arruda, Recife","9999999999","sem promoções");
        Oficina of5 = new Oficina("Seu carro","Rua Raul pompeia, 294, Arruda, Recife","9999999999","sem promoções");
        ArrayList<Oficina> list = new ArrayList<>();
        list.add(of1);
        list.add(of2);
        list.add(of3);
        list.add(of4);
        list.add(of5);
        return list;
    }

    @PostMapping(value="/usuario/login")
    @ResponseBody
    public Usuario Login(@RequestBody RequestLogin request){
        UsuarioRepostiroty.initUsuarios();
        return UsuarioRepostiroty.ValidLogin(request.getEmail(),request.getSenha());
    }
}
