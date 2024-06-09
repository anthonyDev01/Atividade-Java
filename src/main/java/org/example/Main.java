package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        System.out.println("Digite um número: ");
        valor1 = sc.nextInt();

        int valor2;
        System.out.println("Digite outro número: ");
        valor2 = sc.nextInt();

        int resultado = valor1 + valor2;

        System.out.println("O resultado é: "+ resultado);
        sc.close();
    }
}