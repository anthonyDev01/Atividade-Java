package org.example;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro numero");
        int numero2 = sc.nextInt();

        int resultado = numero1 *  numero2;

        System.out.println("O resultado: " + resultado);
    }
}
