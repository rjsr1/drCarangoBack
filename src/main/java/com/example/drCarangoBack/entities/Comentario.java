package com.example.drCarangoBack.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
public class Comentario {
    private int cliente;
    private String nome;
    private String comentario;
    private Double nota;
    private int oficina;
}
