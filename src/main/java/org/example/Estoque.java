package org.example;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        Integer qtdEstoque = sc.nextInt();

        System.out.print("Digite a quantidade maxima em estoque: ");
        Integer qtdMaxEstoque = sc.nextInt();

        System.out.print("Digite a quantidade minima em estoque: ");
        Integer qtdMinEstoque = sc.nextInt();

        Integer qtdMediaEstoque = (qtdMaxEstoque + qtdMinEstoque) / 2;

        if (qtdEstoque >= qtdMediaEstoque)
            System.out.println("Não efetuar a compra");
        else
            System.out.println("Efetuar compra");

    }
}
