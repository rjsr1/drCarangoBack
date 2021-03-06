package com.example.drCarangoBack.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
public class Usuario {
    private String email;
    private String senha;
    private int id;
    private String nome;
}
