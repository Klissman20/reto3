/*
We say that a number is ABUNDANT, when the sum of its proper divisors is greater than him. 
Example: The number 12 is abundant because its divisors, 1, 2, 3, 4 and 6 have 16 which is greater than 12.  
We say that a number is POOR, when the sum of its proper divisors is smaller than him. 
Example: The number 10 is poor because its divisors, 1, 2 and 5 added 8 which is less than 10.  
We say that a number is PERFECT, when the sum of its proper divisors is equal to him. 
Example Number 6 is perfect because its divisors, 1, 2 and 3 totaling 6 which is equal to 6. 
Input: The line of input is an integer number   
Output: Print if the number is poor, Perfect or Abundant 
 */
package reto3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Reto3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,div;
        int suma = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        numero = lector.nextInt();
        for (int i=1;i<numero;i++){
            div = numero % i;
            if (div==0){
                suma+=i;
            }                    
        } 
        if (suma>numero){
            System.out.println("number "+numero+" is abundant");
        }else if(suma<numero){
            System.out.println("number "+numero+" is poor");
        }else if(suma==numero){
            System.out.println("number "+numero+" is perfect");
        }
    }
    
}
