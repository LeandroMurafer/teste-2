import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scn = new Scanner (System.in);

    //Criação das variaveis

        int primeiroValor = 0, segundoValor = 0, resultado = 0;
        System.out.println("Digite o primeiro numero da soma:");
        primeiroValor = scn.nextInt();
        System.out.println("Digite o segundo numero da soma:");
        segundoValor = scn.nextInt();
        
        resultado = primeiroValor + segundoValor;
        System.out.println("A soma de " + primeiroValor + " e " + segundoValor + " eh " + resultado);

    }

}