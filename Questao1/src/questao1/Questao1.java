/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Questao1 {

    public static void main(String[] args) {
        int c=0;
        int qtdMulheres = 0;
        int qtdHomens = 0;
        int idadeMediaHomensExp = 0;
        int qtdHomensExp = 0;
        int qtdMulheresJovensExp = 0;
        int qtdHomensMaisVelhos = 0;
        
        while (c<20){
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ensira a idade: ");
            int idade = teclado.nextInt();

            Scanner entradaSexo = new Scanner(System.in);
            System.out.print("Insira o sexo(Masculino = 1/ Feminino = 2): ");
            int sexo = entradaSexo.nextInt();

            Scanner entradaExp = new Scanner(System.in);
            System.out.print("Experiência?(S=1/N=2) ");
            int experiencia = entradaExp.nextInt();
            
            if (sexo == 2){
                qtdMulheres++;
                if (idade<35 && experiencia==1){
                    qtdMulheresJovensExp++;
                }
            }
            else if (sexo == 1){
                qtdHomens++;
                if (idade>45){
                    qtdHomensMaisVelhos++;
                }
                if (experiencia == 1){
                    idadeMediaHomensExp+=idade;
                    qtdHomensExp++;
                }
            }
            c++;
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
        System.out.println("Quantidade de homens: " + qtdHomens);
        
        float mediaHomensExp = (float) idadeMediaHomensExp/qtdHomensExp;
        System.out.println("Idade média dos homens experientes: " + mediaHomensExp);
        
        float porcentagemHomensVelhos = (float)(qtdHomensMaisVelhos*100)/qtdHomens;
        System.out.println("Porcentagem homens mais velhos: " + porcentagemHomensVelhos);
        
        System.out.println("Quantidade de mulheres jovens experientes: " + qtdMulheresJovensExp);
        
        
    }
    
}
