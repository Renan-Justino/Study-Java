/*
* Crie um programa com uma questão de múltipla escolha.
* A pergunta deverá ter 3 alternativas de resposta, com apenas um correta.
* O usuário vai poder escolher a alternativa correta.
* O prgrama deverá informar se a resposta está correta ou incorreta, e também qual a alternativa correta.
* */

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        System.out.println("Olá, bem vindo ao quiz de multipla escolha.");
        System.out.println("Qual destes números é par?\n" +
                "A: 3\n" +
                "B: 7\n" +
                "C: 8");

        String respostaCorreta = "C";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a resposta correta? \n" +
                "A, B ou C ?");
        String resp = scanner.nextLine();

        String msg;

        if(resp.equalsIgnoreCase(respostaCorreta)) {
            msg = "Parabéns, o número par é 8 !";
        } else {
            msg = "Que pena você errou!" +
                    "A resposta correta era C: 8.";
        }

        System.out.println(msg);
    }
}
