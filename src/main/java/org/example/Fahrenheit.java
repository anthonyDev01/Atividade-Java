package org.example;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em graus");
        float celcius = sc.nextFloat();

        float fahrenheit = ((9 * celcius) + 160) / 5;

        System.out.println("O valor em fahrenheit é " + fahrenheit);

    }
}
