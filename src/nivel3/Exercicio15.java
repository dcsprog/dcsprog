/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel3;

import java.util.Scanner;

/**
 *
 * @author dcsprog
 */
public class Exercicio15 {
    public Exercicio15(){
        solucao15();
    }
    
    public static void solucao15(){
        
        int[] maisVendido = new int[5];
        Scanner n = new Scanner(System.in);
        int quant=0, menor=0, aux=0;
        
        for(int i=0; i<maisVendido.length; i++){
            quant=n.nextInt();
            maisVendido[i]=quant;
            
        }
        
        for(int i=0; i<maisVendido.length-1; i++){
           for(int j=i+1; j<maisVendido.length;j++){
            if(maisVendido[j]<maisVendido[i]){
                aux=maisVendido[j];
                maisVendido[j]=maisVendido[i];
                maisVendido[i]=aux;
                
            }
        }}
        
        
        for(int i=0; i<5; i++){
            System.out.println(maisVendido[i]);
        }
        
        
        
    }
}
