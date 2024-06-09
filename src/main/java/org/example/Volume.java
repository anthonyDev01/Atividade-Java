package org.example;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Digite o debito da conta: ");
        Double debito = sc.nextDouble();

        System.out.println("Digite o credito da conta:");
        Double credito = sc.nextDouble();

        Double saldoAtual = saldo - debito + credito;

        if (saldoAtual < 0)
            System.out.println("O saldo da conta é negativo!");
        else
            System.out.println("O saldo da conta é positivo! "+ saldoAtual+"R$");

    }
}
