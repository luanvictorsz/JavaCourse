package Atividades;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

        // https://docs-oracle-com.translate.goog/javase/8/docs/api/java/time/package-summary.html?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt&_x_tr_pto=tc
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data08 = LocalDate.parse("04/03/2025", fmt01);

        System.out.println(data08.format(fmt01)); //exibindo no formato dia mes e ano
        System.out.println(data05.format(fmt02)); //exibindo ono formado dia, mes ano e horario
    }
}
