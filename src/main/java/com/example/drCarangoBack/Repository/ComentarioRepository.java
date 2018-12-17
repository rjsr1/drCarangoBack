package com.example.drCarangoBack.Repository;

import com.example.drCarangoBack.entities.Comentario;

import java.util.ArrayList;
import java.util.List;

public class ComentarioRepository {
    private static ArrayList<Comentario> comentarios;

    public static void initComentarios(){
        if(comentarios==null){
            comentarios = new ArrayList<>();
            Comentario c1=new Comentario(1,"rodolfo","boa opção",5.0,1);
            Comentario c2=new Comentario(2,"carlos","Excelente Serviço",5.0,1);
            Comentario c3=new Comentario(3,"joao","mais ou menos",3.0,1);
            Comentario c4=new Comentario(4,"rodolfo","bom",4.0,1);
            Comentario c5=new Comentario(5,"jose","pode melhorar",3.0,1);
            Comentario c6=new Comentario(6,"maria","gostei",5.0,1);
            Comentario c7=new Comentario(7,"carlos","valeu a pena",4.0,1);
            Comentario c8=new Comentario(8,"antonio","boa opção",5.0,2);
            Comentario c9=new Comentario(9,"claudio","massa",3.0,2);
            Comentario c10=new Comentario(10,"kibe","deixou a desejar",3.0,2);
            Comentario c11=new Comentario(11,"marcos","ruim",2.0,2);
            Comentario c12=new Comentario(12,"rodolfo","pode melhorar e muito",3.0,2);
            Comentario c13=new Comentario(13,"rodolfo","boa opção",5.0,3);
            Comentario c14=new Comentario(14,"jailson","boa opção",5.0,4);
            Comentario c15=new Comentario(15,"rodolfo","boa opção",5.0,4);
            Comentario c16=new Comentario(16,"rodolfo","boa opção",5.0,4);
            Comentario c17=new Comentario(17,"rodolfo","ruim",3.0,4);
            Comentario c18=new Comentario(18,"rodolfo","boa opção",4.0,4);
            Comentario c19=new Comentario(19,"rodolfo","pode melhorar e muito",2.0,4);
            Comentario c20=new Comentario(20,"rodolfo","deixou a desejar",1.0,3);
            comentarios.add(c1);
            comentarios.add(c2);
            comentarios.add(c3);
            comentarios.add(c4);
            comentarios.add(c5);
            comentarios.add(c6);
            comentarios.add(c7);
            comentarios.add(c8);
            comentarios.add(c9);
            comentarios.add(c10);
            comentarios.add(c11);
            comentarios.add(c12);
            comentarios.add(c13);
            comentarios.add(c14);
            comentarios.add(c15);
            comentarios.add(c16);
            comentarios.add(c17);
            comentarios.add(c18);
            comentarios.add(c18);
            comentarios.add(c19);
            comentarios.add(c20);
        }
    }

    public static List<Comentario> getComentarioByIdOficina(int id){
        ArrayList<Comentario> comentariosResponse=new ArrayList<Comentario>();
        for (Comentario comentario:
             comentarios) {
            if(comentario.getOficina()==id){
                comentariosResponse.add(comentario);
            }
        }
        return comentariosResponse;
    }
}
