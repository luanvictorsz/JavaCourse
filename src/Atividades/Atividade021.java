package Atividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Atividade021 {
    public  static  void Executar() throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("19/03/2025");
        Date y2 = sdf2.parse("19/03/2025 20:00:24");

        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: " + sdf2.format(y2));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L); //uma da manha de 1970

        System.out.println("Data e hora atual: " + sdf2.format(x1));

        //mesmo resultado
        System.out.println("Data e hora atual usando milissegundos: " + sdf2.format(x2));
        System.out.println("Data e hora com milissegundos zerados: " + sdf2.format(x3));
        System.out.println(sdf2.format(x4));
    }
}
