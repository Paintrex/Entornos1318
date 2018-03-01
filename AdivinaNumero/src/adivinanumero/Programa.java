package adivinanumero;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("VAMOS A JUGAR");
        Scanner scan = new Scanner(System.in);
        boolean jugar = true;
        int adivinar = 0;
        int num;
        while (jugar){
            
            adivinar = 1 + (int)(10.0 * Math.random());
            
            System.out.print("Dime un numero del 1 al 10 : ");
            num = scan.nextInt();
            
            if (num == adivinar){
                
                System.out.println("¡Acertaste! :D");
                jugar = false;
                
            }else if(num <= 0){
                
                System.out.println("Adios...");
                
            }else{
                
                System.out.println("¡No! Era el " + adivinar);
                
            }
            
            System.out.println();
        }
    }
}
