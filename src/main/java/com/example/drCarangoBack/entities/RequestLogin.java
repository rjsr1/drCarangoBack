package com.example.drCarangoBack.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Data
@NoArgsConstructor
public class RequestLogin {
    private String login;
    private String senha;
}
