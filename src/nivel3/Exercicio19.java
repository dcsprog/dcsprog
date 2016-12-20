/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel3;

import java.util.Scanner;

/**
 *
 * @author JL SELEC
 */
public class Exercicio19 {
    public Exercicio19(){
        solucao19();
        
    }
   
    public static int fatorialRecursivo(int num){
        
        if(num==0){
            return 1;
        }
        
        return num*fatorialRecursivo(num-1);
    }
    
    
    public static void solucao19(){
    
    int numero=0, factorial=1;
    Scanner n = new Scanner(System.in);
    System.out.println("Entre com um numero: ");
    numero=n.nextInt();
   
    for(int i=numero; i>0;i--){
        factorial*=i;
    }
    System.out.println(factorial);
    
     int numero2=0;
     
     System.out.println("Entre com um segundo numero: ");
     numero2=n.nextInt();
     int novoF=fatorialRecursivo(numero2);
     System.out.println(novoF);
    }
   
        
    }
    

