/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Questao4 {

    public static void main(String[] args) {
       int c = 0;
       float salarioNovo;
       float totalSalAtual = 0.0f;
       float totalSalNovo = 0.0f;
       
       while (c<321){
           Scanner entradaID = new Scanner(System.in);
           System.out.print("Entre com o código do funcionário: ");
           int codigo = entradaID.nextInt();
           
           Scanner entradaCategoria = new Scanner(System.in);
           System.out.print("Categoria: ");
           String categoria = entradaCategoria.next();
           
           Scanner entradaSalAtual = new Scanner(System.in);
           System.out.println("Salário atual: ");
           float salarioAtual = entradaSalAtual.nextFloat();
           
            switch (categoria) {
                case "A":
                case "C":
                    salarioNovo = (float)(salarioAtual + (salarioAtual*0.02));
                    System.out.println("Código: " + codigo);
                    System.out.println("Salário Atual: " + salarioAtual);
                    System.out.println("Salário Novo: " + salarioNovo);
                    System.out.println(" ");
                    totalSalAtual+=salarioAtual;
                    totalSalNovo+=salarioNovo;
                    break;
                case "B":
                case "D":
                case "E":
                    salarioNovo = (float) (salarioAtual + (salarioAtual*0.03));
                    System.out.println("Código: " + codigo);
                    System.out.println("Salário Atual: " + salarioAtual);
                    System.out.println("Salário Novo: " + salarioNovo);
                    System.out.println(" ");
                    totalSalAtual+=salarioAtual;
                    totalSalNovo+=salarioNovo;
                    break;
                case "F":
                case "G":
                    salarioNovo = (float) (salarioAtual + (salarioAtual*0.05));
                    System.out.println("Código: " + codigo);
                    System.out.println("Salário Atual: " + salarioAtual);
                    System.out.println("Salário Novo: " + salarioNovo);
                    System.out.println(" ");
                    totalSalAtual+=salarioAtual;
                    totalSalNovo+=salarioNovo;
                    break;
            }
            c++;
            
       }
        System.out.println("Total salário atual: " + totalSalAtual);
        System.out.println("Total salário novo: " + totalSalNovo);
    }
    
}
