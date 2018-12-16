package com.example.drCarangoBack.Repository;

import com.example.drCarangoBack.entities.Usuario;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data

public class UsuarioRepostiroty {
    public static ArrayList<Usuario> usuarios;

    public static void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public static void initUsuarios(){
        if(usuarios==null){
            usuarios=new ArrayList<>();
            Usuario user = new Usuario("rodolfo","1234",1,"rodolfo");
            usuarios.add(user);
        }
    }
    public static Usuario getUsuario(int ID){
        for (Usuario user :
                usuarios) {
            if (user.getID()==ID) {
                return user;
            }
        };
        return null;
    }
    public static Usuario ValidLogin(String login,String senha) {

        for (Usuario user :
                usuarios) {
            if (user.getLogin() == login && user.getSenha() == senha) {
                return user;
            }
        };
        return null;
    }


}
