package com.example.drCarangoBack.Repository;

import com.example.drCarangoBack.entities.Usuario;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data

public class UsuarioRepostiroty {
    public static ArrayList<Usuario> usuarios;

    public static void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public static void initUsuarios(){
        if(usuarios==null){
            usuarios=new ArrayList<>();
            Usuario user = new Usuario("rodolfo@gmail.com","1234",1,"rodolfo");
            usuarios.add(user);
        }
    }
    public static Usuario getUsuario(int ID){
        for (Usuario user :
                usuarios) {
            if (user.getId()==ID) {
                return user;
            }
        };
        return null;
    }
    public static Usuario ValidLogin(String email,String senha) {

        for (Usuario user :
                usuarios) {
            if (Objects.equals(user.getEmail(), email) && Objects.equals(user.getSenha(), senha)) {
                return user;
            }
        };
        return null;
    }

    public static void AddUsuario(String email, String senha) {
        usuarios.add(new Usuario(email,senha,usuarios.size()+1,buildNome(email)));
    }

    private static String buildNome(String email){
        String[] splitName=email.split("@");
        return splitName[0];
    }
}
