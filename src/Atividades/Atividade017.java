package Atividades;

import java.util.ArrayList;
import java.util.List;

public class Atividade017 {
    public static void Executar(){
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");

        for(String x : lista){
            System.out.println(x);
        }
    }
}
