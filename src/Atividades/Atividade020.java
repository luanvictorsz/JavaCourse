package Atividades;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Atividade020 {
    public static  void Executar(){
        LocalDate d01 = LocalDate.parse("2025-03-16");
        LocalDateTime d02 = LocalDateTime.parse("2025-03-16T22:59:25");
        Instant d03 = Instant.parse("2025-03-16T22:59:25Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: "+ nextWeekLocalDate);

        Instant pastWeekInstante = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstante = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstante: " + pastWeekInstante);
        System.out.println("nextWeekInstante: " + nextWeekInstante);
    }
}
