import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Sumacifras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sumacifras
{
   public static void main(String[] args) {
        int num1;    
        int num2;    
        int total;        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero de dos digitos");    
        num1 = teclado.nextInt();    
        
        num2 = num1;    
        total=0;
        
        while(num1!=0){
            total=total+num1%10;
            num1=num1/10;
        }
        System.out.println("La suma es:  "+num2+" es  "+total);
    }
}
