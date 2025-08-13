/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;

import java.util.Scanner;

/**
 *
 * @author Matheus Garcia
 * 
 */
public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a nota do 1º semestre (0 a 10): ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota do 2º semestre (0 a 10): ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota do 3º semestre (0 a 10): ");
        double nota3 = sc.nextDouble();

        // Cálculos
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        // Exibição dos resultados
        System.out.println("Total de pontos: " + soma);
        System.out.println("Média: " + media);

        // Verificação de aprovação
        if (soma >= 21) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        sc.close();
    }
}
