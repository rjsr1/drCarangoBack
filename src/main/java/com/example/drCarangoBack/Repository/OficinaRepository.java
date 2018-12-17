package com.example.drCarangoBack.Repository;

import com.example.drCarangoBack.entities.Oficina;

import java.util.ArrayList;
import java.util.List;

public class OficinaRepository {

    private static ArrayList<Oficina> oficinas;

    public static void initOficina() {
        if (oficinas == null) {
            oficinas = new ArrayList<Oficina>();
            Oficina of1 = new Oficina("BiAuto", "Av. Beberibe, 965 - Arruda, Recife - PE, 52041-430", "3241-8835", "", 1);
            Oficina of2 = new Oficina("Lucena Auto Service", " R. Cel. Alfredo Duarte, 490 - Afogados, Recife - PE, 50830-380", "3428-2786", "Todos os serviços com 10% de desconto", 2);
            Oficina of3 = new Oficina("Centro Automotivo Piloto", "Av. Caxangá, 3515 - Iputinga, Recife - PE, 50670-000", "3034-4433", "", 3);
            Oficina of4 = new Oficina("Auto Total", "Av. Norte Miguel Arraes de Alencar, 4861 - Tamarineira, Recife - PE, 52051-000", "3441-5085", "10% desc troca de óleo", 4);
            Oficina of5 = new Oficina("Oficina Ramos", "R. Frederico, 68 - Encruzilhada, Recife - PE, 52041-540", "3426-9381", "Troca de óleo por R$ 50,00 ", 5);
            oficinas.add(of1);
            oficinas.add(of2);
            oficinas.add(of3);
            oficinas.add(of4);
            oficinas.add(of5);
        }
    }

    public static List<Oficina> getOficinas() {
        return oficinas;
    }

    public static Oficina getOficinaById(int id) {
        for (Oficina oficina :
                oficinas) {
            if (oficina.getId() == id) {
                return oficina;
            }
        }
        return null;
    }
}
