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

        System.out.println("Data e atual hora: " + sdf2.format(x1));
    }
}
