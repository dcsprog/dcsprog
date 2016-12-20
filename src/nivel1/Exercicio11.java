/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel1;

import java.util.Scanner;

/**
 *
 * @author JL SELEC
 */
public class Exercicio11 {
    public Exercicio11(){
        solucao11();
    }
    
    public static void solucao11(){
        double[] modulo= new double[5];
        double nota;
        double soma=0, media=0;
        Scanner n= new Scanner(System.in);
        System.out.println("Insira as notas dos 5 modulos");
        for(int i=0; i<modulo.length;i++){
            System.out.println("Insira a "+(i+1)+" nota");
            nota=n.nextDouble();
            modulo[i]=nota;
            soma+=nota;
        }
        media=soma/5;
        
        System.out.println("A media das notas obtidas nos modulos foram "+media);
    }
}
