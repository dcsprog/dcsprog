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
        int num1=0, cont=0;
        int rand = aleatorio(10,0);
        Scanner n = new Scanner(System.in);
        boolean jogo=true;
        char opc=' ';
        do{
            
            System.out.println("Escolha uma opcao para o jogo Somo e Desce:\n\n"
                    + "numero maior -->  c \n\nnumero menor --> b\n\n");
            
            
            System.out.println(num1);
            opc=n.nextLine().charAt(0);
        
            int ale;
            do{
                ale=aleatorio(10,0);
            }while(ale==rand);
            
            switch(opc){
                case 'c':
                    if(ale<rand){
                        System.out.println("Acertou...");
                        cont++;
                    }else {
                        System.out.println("Sorry, tente outra vez");
                        jogo=false;
                       
                    }
                    break;
                case 'b':
                    if(ale>rand){
                        System.out.println("Acertou...");
                        cont++;
                    }else {
                        System.out.println("Sorry, tente outra vez");
                        jogo=false;
                       
                    }
                    break;
            }
            
        
        
        
        }while(jogo);
        System.out.println("Voce consegui acertar "+cont+" vezes....");
        
    }
    
    public static int aleatorio(int min, int max){
        Random rand = new Random();
        return rand.nextInt((10- 0)+1)+0;
    }
    
}
