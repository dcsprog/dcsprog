/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel1;

/**
 *
 * @author JL SELEC
 */
public class Exercicio14 {
    public Exercicio14(){
        solucao14();
    }
    
    public static void solucao14(){
      int[] valores  = new int[3];
      int produto=0;
      valores[0]=5;
      valores[1]=2;
      valores[2]=7;
      
       for(int i=0; i<valores.length;i++){
           if(i==0){
             produto=valores[i];
           }else
               produto*=valores[i];
           
       }
       System.out.println("O resultado do produto e "+produto);
    }
}
