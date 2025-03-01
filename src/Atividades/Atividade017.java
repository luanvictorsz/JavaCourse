package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atividade017 {
    public static void Executar(){
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add("Elisa");

        lista.add(2, "Victor"); //adicionando o 'elemento' Victor no index 2.

        lista.remove("Anna"); //removendo o elemento "Anna"

        System.out.println(lista.size()); // tamanho da lista

        for(String x : lista){
            System.out.println(x);
        }

        System.out.println("----------------------------------");
        lista.remove(1);
        lista.removeIf(x -> x.charAt(0) == 'M');
        for (String x : lista){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");
        System.out.println("Index of Victor: " + lista.indexOf("Victor"));
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }

    }
}
