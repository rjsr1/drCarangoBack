package com.example.drCarangoBack.Repository;

import com.example.drCarangoBack.entities.Oficina;

import java.util.ArrayList;
import java.util.List;

public class OficinaRepository {

    private static ArrayList<Oficina> oficinas;

    public static void initOficina(){
        Oficina of1 = new Oficina("BiAuto","Rua Raul pompeia, 294, Arruda, Recife","9999999999","sem promoções",1);
        Oficina of2 = new Oficina("Lucena Auto Servic"," R. Cel. Alfredo Duarte, 490 - Afogados, Recife - PE, 50830-380","3428-2786","sem promoções",2);
        Oficina of3 = new Oficina("Centro Automotivo Piloto","Av. Caxangá, 3515 - Iputinga, Recife - PE, 50670-000","3034-4433","sem promoções",3);
        Oficina of4 = new Oficina("Auto Total","Av. Norte Miguel Arraes de Alencar, 4861 - Tamarineira, Recife - PE, 52051-000","3441-5085","10% desc troca de óleo",4);
        Oficina of5 = new Oficina("Oficina Ramos","R. Frederico, 68 - Encruzilhada, Recife - PE, 52041-540","3426-9381","sem promoções",5);
        oficinas.add(of1);
        oficinas.add(of2);
        oficinas.add(of3);
        oficinas.add(of4);
        oficinas.add(of5);
    }

    public static List<Oficina> getOficinas(){
        return oficinas;
    }

    public static Oficina getOficinaById(int id){
        for (Oficina oficina:
             oficinas) {
            if(oficina.getId()==id){
                return oficina;
            }
        }
        return null;
    }
}
