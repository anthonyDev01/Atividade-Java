package org.example;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        float altura = sc.nextFloat();

        System.out.print("Digite o peso: ");
        float peso = sc.nextFloat();

        float imc = peso/(altura * altura);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.5 & imc <= 24.9){
            System.out.println("peso normal");
        } else if (imc >= 25 & imc <= 29.9) {
            System.out.println("sobre peso");
        }
        else if(imc >= 30 & imc <= 34.9){
            System.out.print("Obesidade grau I");
        }
        else if(imc >= 35 & imc <= 39.9){
            System.out.print("Obesidade grau II");
        }
        else {
            System.out.print("Obesidade grau III");
        }

    }
}
