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
public class Exercicio6 {
    public Exercicio6(){
        solucao6();
    }
    
    
    public static void solucao6(){
        int num1=0, num2=0, maior=0,menor=0;
       
        Scanner n= new Scanner(System.in);
        System.out.println("Introduza dois valores: ");
        System.out.print("primeiro valor: ");
        menor=maior=num1=n.nextInt();
        System.out.print("segundo valor: ");
        num2=n.nextInt();
        
        if(num1<num2){
            menor=num1;
            maior=num2;
        }else {
            
            menor=num2;
            maior=num1;
        }
        for(int i=menor;i<=maior; i++){
            if(i%2==0){
                System.out.println("Os numeros pares encontrado entre o "
                        +menor+" e o "+maior+" foi : "+ i);
            }
        
        }

    
    }

}
