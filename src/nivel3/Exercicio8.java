/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JL SELEC
 */
public class Exercicio8 {
    public Exercicio8(){
        solucao8();
    }
    
    
    public static void solucao8(){
        int num1=0, maior=10, menor=0, cont=0;
        Random rand = new Random();
        Scanner n = new Scanner(System.in);
        boolean jogo=true;
        char opc=' ';
        do{
            
            System.out.println("Escolha uma opcao para o jogo Somo e Desce:\n\n"
                    + "numero maior -->  c \n\nnumero menor --> b\n\n");
            if(cont==0){
            num1=rand.nextInt(maior-menor);
            }
            
            System.out.println(num1);
            opc=n.nextLine().charAt(0);
        
            switch(opc){
                case 'c':
                    num1=aleatorio(num1,maior);
                    cont++;
                    break;
                case 'b':
                    num1=aleatorio(menor,num1);
                    cont++;
                    break;
            }
            
        
        
        
        }while(jogo);
        
        
    }
    
    public static int aleatorio(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min)+1)+min;
    }
    
}
