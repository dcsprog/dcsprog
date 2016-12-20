/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel1;

import java.util.Scanner;

/**
 *
 * @author dcprog
 */
public class Exercicio1 {

    public Exercicio1() {
        solucao4();
    }
    
    public static void solucao4(){
    int valor=0;
    int[] todoValores= new int[5];
    int menor=0, maior=0;
    
    Scanner n = new Scanner(System.in);
    
    System.out.println("Introduza cinco valorez: ");
    for(int i=0;i<5;i++){
        System.out.print((i+1)+" valor --> ");
        valor=n.nextInt();
        todoValores[i]=valor;
        if(i==0){
            menor=maior=valor;
        }
        if(valor<menor){
            menor=valor;
        }else if(valor>maior){
            maior=valor;
        }
    }
    System.out.println("O menor valor inserido foi "
            +menor+" e o maior valor foi "+maior);
    
    }
}
    
    

