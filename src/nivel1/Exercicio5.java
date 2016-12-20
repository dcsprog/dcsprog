/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dcsprog
 */
public class Exercicio5 {
    public Exercicio5() throws IOException{
        solucao5();
    }
    
    
    
    public static void solucao5() throws IOException{
        Scanner n = new Scanner(System.in);
        int[] valores= new int[100];
        int valor=0, soma=0;
        
        do{
            System.out.println("Introduza o 0 para encerrar!");
            
            for(int i=0; i<valores.length-1; i++){
                System.out.println("\n\nEntre com um valor: ");
                valor=n.nextInt();
                if(valor==0){
                    System.out.println("A soma dos valores e: "+soma);
                    break;
                }
                valores[i]=valor;
                soma+=valores[i];
            }
            
            
            if(valor==0){
                System.out.println("O programa vai encerrar...");
                System.in.read();
            }
        
        }while(valor!=0);
        
    } 
}
