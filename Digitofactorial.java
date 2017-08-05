import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Digitofactorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Digitofactorial
{
    public static void main(String[] args) {
        double num;    
        double fact=1;    
        int n=0;
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero");    
        num = teclado.nextInt();
        
        while ( num!=0) {
            fact=fact*num;
            num--;
        }
        System.out.println("El factorial es:"+fact);
        
        while (fact%10==0){
            n++;
            fact=fact/10;
        }
        System.out.println("LA cantidad de 0 al final es:"+n);
    }
}
