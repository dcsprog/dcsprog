/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel0;

/**
 *
 * @author dcsprog
 */
public class Exercicio4 {

    public Exercicio4() {
        solucao4();
    }
    
    
    public static void solucao4(){
        
        int[] valor = new int[4];
        int soma=0;
        
        valor[0]=3;
        valor[1]=5;
        valor[2]=6;
        valor[3]=1;
        
        for(int i=0; i<4;i++){
            soma+=valor[i];
        }
        
        System.out.println("A soma dos valores presentes no array e: "+soma); 
     }
    
    
    
}
