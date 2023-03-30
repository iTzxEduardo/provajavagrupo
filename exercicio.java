package AtividadeEmGrupo;

import java.util.Scanner;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class exercicio {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite seu nome ");
        String nome = sc.nextLine();
        System.out.println("Digite 1 para masculino e 2 para feminino ");
        double sexo = sc.nextDouble();
        System.out.println("Digite seu peso ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura ");
        double altura = sc.nextDouble();
        double pesoIdeal;
        double sobra;

        if (sexo == 1) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            pesoIdeal = 72.7 * altura - 58;
        }
        System.out.println("peso ideal é " + pesoIdeal);
        if (peso > pesoIdeal) {
            System.out.println();
        }
        if (pesoIdeal >= 0) {
            sobra = pesoIdeal - peso;
            System.out.println("voce prescisa perder um total de " + sobra);
        }

        if (pesoIdeal <= 0) {
            sobra = pesoIdeal - peso;
            System.out.println("voce prescisa ganhar " + sobra);
        }
        double imc = peso / (altura * altura);
        int nivel=0;
        if (imc < 20) {
            nivel = 1;
            System.out.println("Peso leve: Atividade ganhar massa");

        }
        if (imc > 20 && imc <= 27) {
            nivel = 2;
            System.out.println("Peso normal:Ativade moderada ");
        }
        if (imc > 27) {
            nivel = 3;
            System.out.println("Atividade pesada: Perde peso");
        }
        System.out.println("Digite sua idade ");
        double idade = sc.nextDouble();
        int idadeFaixa=0;
        
        if (idade > 16 && idade <= 25) {
            idadeFaixa = 1;
        }
        if (idade > 25 && idade <= 35) {
            idadeFaixa = 2;
        }
        if (idade > 36 && idade <= 45) {
            idadeFaixa = 3;
        }
        if (idade > 46 && idade <= 55) {
            idadeFaixa = 4;
        }
        if (idade > 56 && idade <= 65) {
            idadeFaixa = 5;
        }
        if (idade > 66) {
            idadeFaixa = 6;
        }
        if (idadeFaixa == 1 && nivel == 1) {
            System.out.println("treino é Musculação Leve e Ioga ");
        }
        if (idadeFaixa == 1 || nivel == 2) {
            System.out.println("treino é Musculação Musculação moderada e Dança ");
        }
        if (idadeFaixa == 1 || nivel == 3) {
            System.out.println("treino é Luta ");
        }
        if (idadeFaixa == 2 || nivel == 1) {
            System.out.println("treino é Ioga ");
        }
        if (idadeFaixa == 2 || nivel == 2) {
            System.out.println("treino é Musculação Moderada,Dança e Corrida ");
        }
        if (idadeFaixa == 2 || nivel == 3) {
            System.out.println("treino é Musculação intensa e Luta ");
        }
        if (idadeFaixa == 3 || nivel == 1) {
            System.out.println("treino é Ioga ");
        }
        if (idadeFaixa == 3 || nivel == 2) {
            System.out.println("treino é Musculação moderna,Dança e Corrida ");
        }
        if (idadeFaixa == 3 || nivel == 3) {
            System.out.println("treino é Luta,Musculação intensa ");
        }
        if (idadeFaixa == 4 || nivel == 1) {
            System.out.println("treino é Ioga e Musculação leve ");
        }
        if (idadeFaixa == 4 || nivel == 2) {
            System.out.println("treino é Musculação moderada,Dança e Corrida ");
        }
        if (idadeFaixa == 4 || nivel == 3) {
            System.out.println("treino é Pilate e Luta ");
        }
        if (idadeFaixa == 5 || nivel == 1) {
            System.out.println("treino é Ioga e Musculação leve ");
        }
        if (idadeFaixa == 5 || nivel == 2) {
            System.out.println("treino é Dança e Corrida ");
        }
        if (idadeFaixa == 5 || nivel == 3) {
            System.out.println("treino é Pilates ");
        }
        if (idadeFaixa == 6 || nivel == 1) {
            System.out.println("treino é Ioga e Musculação leve ");
        }
        if (idadeFaixa == 6 || nivel == 2) {
            System.out.println("treino é Dança ");
        }
        if (idadeFaixa == 6 || nivel == 3) {
            System.out.println("treino é Pilates ");
        }
    }

}
