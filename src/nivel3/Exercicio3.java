/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel3;

import java.util.Random;

/**
 *
 * @author dcsprog
 */
public class Exercicio3 {

    public Exercicio3() {
        solucao3();
    }
    public static void solucao3(){
        Random rand = new Random();
        int[] num = new int[20];
        int n=0, cont1=0, cont2=0, cont3=0, cont4=0, 
                 cont5=0, cont6=0,cont7=0, cont8=0,cont9=0;
        for(int i=0;i<num.length;i++){
            num[i]=rand.nextInt(9)+1;
            if(num[i]==1){
                cont1++;
            }else if(num[i]==2){
                cont2++;
            }else if(num[i]==3){
                cont3++;
            }else if(num[i]==4){
                cont4++;
            }else if(num[i]==5){
                cont5++;
            }else if(num[i]==6){
                cont6++;
            }else if(num[i]==7){
                cont7++;
            }else if(num[i]==8){
                cont8++;
            }else if(num[i]==9){
                cont9++;
            }
        }
        
        System.out.println("Numero de repeticoes: 1-"+cont1+"x 2-"+cont2+
                "x 3-"+cont3+"x 4-"+cont4+"x 5-"+cont5+"x 6-"+cont6+
                "x 7-"+cont7+"x 8-"+cont8+"x 9-"+cont9+"x");
        
        
    }
}
