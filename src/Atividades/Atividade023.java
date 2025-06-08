package Atividades;

import java.util.Scanner;

public class Atividade023 {
    public static void Executar()
    {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);

        sc.close();

        System.out.println("Fim do programa");
    }
}
