package Atividades;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Atividade022 {
    public static void Executar()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2025-03-22T19:28:07Z"));

        System.out.println(d);
    }
}
