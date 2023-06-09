package com.project;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double N1, N2, resultado;
        int op;

        System.out.print("Ola, digite um numero: ");
        N1 = sc.nextDouble();
        System.out.print("Digite outro numero: ");
        N2 = sc.nextDouble();

        System.out.print(" 1 para SOMA | 2 para SUBTRACAO | 3 para MULTIPLICACAO | 4 para DIVISAO");
        op = sc.nextInt();

        if (op == 1) {
            resultado = N1 + N2;
            System.out.println("RESULTADO: " + resultado);
        }
        else if (op == 2) {
            resultado = N1 - N2;
            System.out.println("RESULTADO: " + resultado);
        }
        else if (op == 3) {
            resultado = N1 * N2;
            System.out.println("RESULTADO: " + resultado);
        }
        else if (op == 4) {
            resultado = N1 / N2;
            System.out.println("RESULTADO: " + resultado);
        }
        else {
            System.out.println("ERRO!");
        }

        sc.close();

    }

}