package bodymassindex;


import java.util.Scanner;


public class App {

    
    public static void main(String args[]) {


        System.out.println("=============================================================================================");
        System.out.println("BIENVENID@ A LA CALCULADORA IMC");
        System.out.println("=============================================================================================");


        Scanner input = new Scanner(System.in);
        
        float height = 0.0f;
        float weight = 0.0f;
                
        System.out.print("Ingresa tu altura (metros): ");
    
        
        while (!input.hasNextFloat()) {
           
            System.out.println("Los datos ingresado no son validos.");
            System.out.print("Ingresa tu altura (metros): ");
            input.next();
            input.nextLine();
        }

        
        height = input.nextFloat(); input.nextLine();

        System.out.print("Ingresa tu peso (KG): ");


        while (!input.hasNextFloat()) {

            System.out.println("Los datos ingresado no son validos.");
            System.out.print("Ingresa tu peso (KG): ");
            input.next();
            input.nextLine();
        }

        
        weight = input.nextFloat(); input.nextLine();

        float mass = weight/(height*height);

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
         
        System.out.println("=============================================================================================");
        System.out.println("Tu altura es: "+height+" metros, tu peso es: "+weight+" Kg y tu IMC es "+mass+". "+result);
        System.out.println("=============================================================================================");




        input.close();
    }
}
