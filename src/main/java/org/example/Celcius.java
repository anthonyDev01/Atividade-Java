package org.example;

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit");
        float fahrenheit = sc.nextFloat();

        float celcius = ((fahrenheit - 32) * 5) /9 ;

        System.out.println("A temperatura em celcius é: " + celcius);
    }
}
