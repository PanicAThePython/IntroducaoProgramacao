/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 0;
        int menor21 = 0;
        int mulheres = 0;
        int maiores60 = 0;
        int mulheres60 = 0;
        while(c<20){
            Scanner entradaAno = new Scanner(System.in);
            System.out.print("Ano de nascimento: ");
            int anoNasc = entradaAno.nextInt();
            
            Scanner entradaSexo = new Scanner(System.in);
            System.out.print("Sexo(M=1, F=2) ");
            int sexo = entradaSexo.nextInt();
            
            int idade = 2020 - anoNasc;
            
            if (idade<21){
                menor21++;
            }
            if (sexo == 2){
                mulheres++;
            }
            if (idade>60){
                maiores60++;
                if (sexo == 2){
                    mulheres60++;
                }
            }
            c++;
        }
        System.out.println(" ");
        System.out.println("------------------------------------");
        float porc21 = (float) (menor21*100)/20;
        System.out.println("Porcentagem menores de 21: " + porc21);
        float porcMulheres = (float) (mulheres*100)/20;
        System.out.println("Porcentagem de mulheres: " + porcMulheres);
        System.out.println("Maiores de 60: " + maiores60);
        System.out.println("Mulheres maiores de 60: " + mulheres60);
    }
    
}
