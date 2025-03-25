package Atividades;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Atividade022 {
    public static void Executar()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2025-03-22T19:28:07Z"));

        Calendar cal = Calendar.getInstance();

        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);

        d = cal.getTime();

        System.out.println(d);

        //obtendo uma unidade de tempo
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(Calendar.MONTH);

        System.out.println("Minutos: " + minutes);
        System.out.print("Mês: " + month );


    }
}
