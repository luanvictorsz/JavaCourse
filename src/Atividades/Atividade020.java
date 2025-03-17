package Atividades;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Atividade020 {
    public static  void Executar(){
        LocalDate d01 = LocalDate.parse("2025-03-16");
        LocalDateTime d02 = LocalDateTime.parse("2025-03-16T22:59:25");
        Instant d03 = Instant.parse("2025-03-16T22:59:25Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: "+ nextWeekLocalDate);
    }
}
