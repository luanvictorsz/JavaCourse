package Atividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Atividade021 {
    public  static  void Executar() throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //definindo modelo UTC de forma manual

        Date y1 = sdf1.parse("19/03/2025");
        Date y2 = sdf2.parse("19/03/2025 20:00:24");
        Date y3 = Date.from(Instant.parse("2025-03-21T15:42:07Z"));

        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3)); //data formato UTC - A letra Z defini isso


        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L); //uma da manha de 1970

        System.out.println("Data e hora atual: " + sdf2.format(x1));

        //mesmo resultado
        System.out.println("Data e hora atual usando milissegundos: " + sdf2.format(x2));
        System.out.println("Data e hora com milissegundos zerados: " + sdf2.format(x3));
        System.out.println(sdf2.format(x4));

        System.out.println("----------");
        System.out.println("formato utc: " + sdf3.format(x1));
        System.out.println("formato utc: " + sdf3.format(x2));
        System.out.println("formato utc: " + sdf3.format(x3));
        System.out.println("formato utc: " + sdf3.format(x4));
        System.out.println("formato utc: " + sdf3.format(y1));
        System.out.println("formato utc: " + sdf3.format(y2));
        System.out.println("formato utc: " + sdf3.format(y3));

    }
}
