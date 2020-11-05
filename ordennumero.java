package ejercicios;

import java.util.Scanner;

public class ordennumero {

    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);
            Scanner teclado2 = new Scanner(System.in);
            Scanner teclado3 = new Scanner(System.in);
            
            System.out.println("Ingrese tres numeros: ");
            
            int num1 = teclado.nextInt();
            int num2 = teclado2.nextInt();
            int num3 = teclado3.nextInt();
            
            
            if ((num1 > num2) && (num2 > num3))
            {
                System.out.println("El orden es: " + num1 + ", " + num2 + ", " + num3);
            
            }else if ((num1 > num3) && (num3 > num2))
            {
                System.out.println("El orden es: " + num1 + ", " + num3 + ", " + num2);
            
            }else if ((num2 > num1) && (num1 > num3))
            {
                System.out.println("El orden es: " + num2 + ", " + num1 + ", " + num3);
            
            }else if ((num2 > num3) && (num3 > num1))
            {
                System.out.println("El orden es: " + num2 + ", " + num3 + ", " + num1);
            
            }else if ((num3 > num2) && (num2 > num1))
            {
                System.out.println("El orden es: " + num3 + ", " + num2 + ", " + num1);
            
            }else
            {
                System.out.println("El orden es: " + num3 + ", " + num1 + ", " + num2);
            }
            
    }
    
}