package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade018 {

    public static void Executar() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat[i].length; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for(int i = 0; i < mat[i].length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        int count = 0;

        for(int i = 0; i < mat[i].length; i++){
            for(int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print("Negative Numbers: " + count);

        sc.close();
    }
}
