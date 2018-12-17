package com.example.drCarangoBack.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentario {
    private int cliente;
    private String nome;
    private String comentario;
    private Double nota;
    private int oficina;
}
