import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Suma3Num here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suma3Num
{
    public static void main(String[] args) {
        int num1;    
        int num2;    
        int num3;    
        int resul;   
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingrese primer numero");    
        num1 = teclado.nextInt();    
        
        System.out.println("Ingrese segundo numero");    
        num2 = teclado.nextInt();    
        
        System.out.println("Ingrese tercero numero");    
        num3 = teclado.nextInt();        

        resul = num1 + num2 + num3;    
        System.out.println("La suma es:"+resul);
    }
}
