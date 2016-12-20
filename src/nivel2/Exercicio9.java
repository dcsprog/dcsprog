/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JL SELEC
 */
public class Exercicio9 {
    public Exercicio9() throws IOException{
        solucao9();
    }
    
    public static void solucao9() throws IOException{
        
        int num1=0,num2=0, res=0;
        char opc;
        boolean verf=true;
        Scanner n= new Scanner(System.in);
        
          
            System.out.println("Entre com um valor: ");
            num1=n.nextInt();
            System.out.println("----   Calculadora        ----");
            System.out.println("----   (+) Somar          ----");
            System.out.println("----   (-) Subtrair       ----");
            System.out.println("----   (*) multiplicar    ----");
            System.out.println("----   (/) dividir        ----");
            System.out.println("----   (0) Sair           ----\n\n");
            System.out.println("----    Escolha uma Opcao ----");
             
            opc = (char)System.in.read();
        
        switch(opc){
            case'+':
                System.out.println("Entre com o segundo valor: ");
                num2=n.nextInt();
                res=num1+num2;
                System.out.println("O resultado da operacao selecionada e: "+res+"\n\n");
                break;
            case'-':
                System.out.println("Entre com o segundo valor: ");
                num2=n.nextInt();
                res=num1-num2;
                System.out.println("O resultado da operacao selecionada e: "+res);
                break;
            case'*':
                System.out.println("Entre com o segundo valor: ");
                num2=n.nextInt();
                res=num1*num2;
                System.out.println("O resultado da operacao selecionada e: "+res);
                break;
            case'/':
                System.out.println("Entre com o segundo valor: ");
                num2=n.nextInt();
                res=num1/num2;
                System.out.println("O resultado da operacao selecionada e: "+res);
                break;
            case'0':
                System.out.println("O programa vai ser encerrado...");
                break;
            default:
                System.out.println("Nenhuma opcao selecionada...");
        }
        
       
    }
}
