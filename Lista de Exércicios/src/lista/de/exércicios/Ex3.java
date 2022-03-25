package lista.de.exércicios;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner intSC = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = intSC.nextInt();
        int j = 0;        
        int soma = j;
        do{
            j ++;
            soma = soma + j;
        }while(j < n);
 
        j = 1;
        do{
            j++;
            System.out.print(j-1 + " + ");
        }while(j < n);
        
        System.out.println(j + "\n" + "= " + soma);
         
        // TODO code application logic here
    }  
}