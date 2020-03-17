/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Questao2 {

    public static void main(String[] args) {
        int c = 0;
        int otimo = 0;
        int bom = 0;
        int regular = 0;
        int ruim = 0;
        int pessimo = 0;
        int idadeRuim = 0;
        float mediaRuim;
        
        
        while (c<20){
            Scanner entradaIdade = new Scanner(System.in);
            System.out.print("Insira a idade: ");
            int idade = entradaIdade.nextInt();
            
            Scanner entradaOpiniao = new Scanner(System.in);
            System.out.println("Opinião sobre o filme: (otimo = 1; bom = 2; regular = 3; ruim = 4; pessimo = 5) ");
            int opiniao = entradaOpiniao.nextInt();
            
            if (opiniao == 1){
                otimo++;
            }else if (opiniao == 2){
                bom++;
            }else if (opiniao == 3){
                regular++;
            }else if (opiniao == 4){
                ruim++;
                idadeRuim+=idade;
            }else if (opiniao == 5){
                pessimo++;
            }
            c++;
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Quantidade de votos ótimo: " + otimo);
        System.out.println("Diferença de votos entre bom e regular: "+ (bom - regular));
        
        mediaRuim = (float) idadeRuim/ruim;
        System.out.println("Media da idade das pessoas que votaram ruim: " + mediaRuim);
        
        float porcentagemPessimo = (float)(pessimo*100)/20;
        System.out.println("Porcentagem voto pessimo: " + porcentagemPessimo);
    }
    
}
