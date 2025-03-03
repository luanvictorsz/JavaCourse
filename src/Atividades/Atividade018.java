package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade018 {
    //Trabalhando com matrizes
    public static void Executar(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; i < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
}
