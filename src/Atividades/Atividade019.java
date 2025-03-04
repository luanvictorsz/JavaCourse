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

        LocalDate data04 = LocalDate.parse("2025-03-03");
        LocalDateTime data05 = LocalDateTime.parse("2025-03-03T01:30:26"); //obs: ver documentação de data e hora
        Instant data06 = Instant.parse("2025-03-03T23:40:25Z");
        Instant data07 = Instant.parse("2025-03-03T23:41:26-03:00");

        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
    }
}
