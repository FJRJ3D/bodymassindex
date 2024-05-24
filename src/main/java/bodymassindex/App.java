package bodymassindex;


import java.util.Scanner;

public class App {

    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu altura (metros): ");
        float height = input.nextFloat();

        System.out.print("Ingresa tu peso (Kg): ");
        float weight = input.nextFloat();

        float heightSquared = (float) Math.pow(height, 2);
        float mass = weight/heightSquared;

        String result = "mass";
       
                
        if (mass < 16) {
            result = "Tienes delgadez extrema.";
        } 
            else if (mass >= 16 && mass <= 17) {
            result = "Tienes delgadez moderada.";
        } 
            else if (mass >= 17 && mass <= 18.5) {
            result = "Tienes delgadez leve.";
        } 
            else if (mass >= 18.5 && mass <= 25) {
            result = "Tienes un peso normal.";
        } 
            else if (mass >= 25 && mass <= 30) {
            result = "Tienes sobrepeso.";
        } 
            else if (mass >= 30 && mass <= 35) {
            result = "Tienes obesidad leve.";
        } 
            else if (mass >= 35 && mass <= 40) {
            result = "Tienes obesidad moderada.";
        } 
            else {
            result = "Tienes obesidad mórbida.";
        }
         

        System.out.println("Tu altura es: "+height+" metros, tu peso es: "+weight+" Kg y tu IMC es "+mass+". "+result);

        
        input.close();
    }
}
