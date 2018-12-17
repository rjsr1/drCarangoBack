package com.example.drCarangoBack.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
public class Oficina {
    String nome;
    String endereco;
    String fone;
    String promocao;
    int id;
    double lat;
    double lng;
}
