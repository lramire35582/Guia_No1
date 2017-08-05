import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Numprimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numprimo
{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a=0,i,n;
    System.out.println("Ingrese numero");
    n=teclado.nextInt();
    for(i=1;i<(n+1);i++){
        if(n%i==0){
            a++;
        }
    }
    if(a!=2){
        System.out.println("No es Primo"); 
        }else{
            System.out.println("Si es Primo");
        }
  }
}