/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel2;

/**
 *
 * @author dcsprog
 */
public class Exercicio12 {
    public Exercicio12(){
        solucao12();
    }
    
    public static void solucao12(){
        int[] valores = new int[10];
        int contp=0;
        valores[0]=11;
        valores[1]=12;
        valores[2]=9;
        valores[3]=7;
        valores[4]=14;
        valores[5]=8;
        valores[6]=9;
        valores[7]=10;
        valores[8]=12;
        valores[9]=16;
        
        for(int i=0; i<valores.length;i++){
            if(valores[i]>=10){
                contp++;
            }
        }
        System.out.println("Foram encontrado "+contp+" positivas na turma.");
    }
}
