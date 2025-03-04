package Atividades;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Atividade019 {
    public static void Executar(){
        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();

        Instant date03 = Instant.now();

        System.out.println(date01);
        System.out.println(date02);
        System.out.println(date03);
    }
}
