

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resposta;



        System.out.println(" Seja Bem vindo ao programa de tabuada de multiplicação!");



        do {

            System.out.println(" Escolha um numero: ");
            int numero = scanner.nextInt();

            for (int i = 1; i <= 10; i++){

            System.out.println(numero + " x " + i + " = " + numero * i);}

            do {
                System.out.println("Deseja continuar? \n1 - SIM \n2 - NÃO");
                resposta = scanner.nextInt();

                if (resposta != 1 && resposta != 2) {
                    System.out.println("Opção inválida, Digite novamente !");
                }
            } while (resposta != 1 && resposta != 2);

        } while (resposta == 1) ;

        System.out.println(" Programa encerrado !");
        scanner.close();



    }
 }
