/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel2;

import java.util.Scanner;

/**
 *
 * 
 * @author dcsprog
 */
public class Exercicio2 {

    public Exercicio2() {
        solucao2();
    }
    
    public static void solucao2(){
    char[] caracter = new char[5];
    
    int cont=0;
    Scanner n = new Scanner(System.in);
    char carac=' ';
    
    System.out.println("Introduza 5 caracteres: ");
    
    for(int i=0; i<caracter.length;i++){
        carac=n.nextLine().charAt(0);
        caracter[i]=carac;
        if(carac>47&&carac<57){
            cont++;
        }
    }
    
    /*for(int i=0; i<caracter.length;i++){
        System.out.print(caracter[i]);
    }*/
    
    System.out.println("Foram introduzidos "+cont+" caracter entre o 0 e 9");
    
    } 
}
