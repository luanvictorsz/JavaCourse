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

        lista.add(2, "Victor"); //adicionando o 'elemento' Victor no index 2.

        lista.remove("Anna"); //removendo o elemento "Anna"

        System.out.println(lista.size()); // tamanho da lista

        for(String x : lista){
            System.out.println(x);
        }
    }
}
