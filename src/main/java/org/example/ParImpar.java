package org.example;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer numero = sc.nextInt();

        if(numero % 2 == 0)
            System.out.print("é Par");
        else
            System.out.print("é Impar");

    }
}
