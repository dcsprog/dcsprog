/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel2;

import java.util.Scanner;

/**
 *
 * @author JL SELEC
 */
public class Exercicio7 {
        public Exercicio7(){
            solucao7();
        }
        
        public static void solucao7(){
            
            int pilotoA=0, pilotoB=0, pilotoC=0, menor=0, maior=0;
            Scanner n = new Scanner(System.in);
            
            
            System.out.println("Introduza o tempo em segundos do piloto A : ");
            menor=maior=pilotoA=n.nextInt();
            System.out.println("Introduza o tempo em segundos do piloto B : ");
            pilotoB=n.nextInt();
            System.out.println("Introduza o tempo em segundos do piloto C : ");
            pilotoC=n.nextInt();
            
            if(pilotoA<menor){
                menor=pilotoA;
            }else if(pilotoA>maior){
                maior=pilotoA;
            }
            if(pilotoB<menor){
                menor=pilotoB;
            }else if(pilotoB>maior){
                maior=pilotoB;
            }
            if(pilotoC<menor){
                menor=pilotoC;
            }else if(pilotoC>maior){
                maior=pilotoC;
            }
            
            if(menor==pilotoA){
                System.out.println("O piloto mais rapido foi o PilotoA");
            }else if(menor==pilotoB){
                System.out.println("O piloto mais rapido foi o PilotoB");
            }else {
                System.out.println("O piloto mais rapido foi o PilotoC");
            }
            
            if(maior==pilotoA){
                System.out.println("O piloto desclassificado foi o PilotoA");
            }else if(maior==pilotoB){
                System.out.println("O piloto desclassificado foi o PilotoB");
            }else {
                System.out.println("O piloto desclassificado foi o PilotoC");
            }
            
         
            System.out.println("A soma dos tres tempos e: "+convTemp(pilotoA+pilotoB+pilotoC));
        }
        
        public static String convTemp(int seg){
            int h = seg/3600;
            int m = seg%3600/60;
            int s = seg%3600%60; 
            return h+"h:"+ m+"min"+":"+ s+"segundos";
        }
}
