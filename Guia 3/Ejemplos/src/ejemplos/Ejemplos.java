package ejemplos;

import java.util.Scanner;

public class Ejemplos {

    public static void main(String[] args) {
   
        Scanner leer = new Scanner (System.in);
        int i;
        
///////////////////////////////// IF ELSE //////////////////////////////////////       
//        System.out.println("Ingrese un número: ");
//        int n1 = leer.nextInt();
//        System.out.println("Ingrese otro número: ");
//        int n2 = leer.nextInt();
//        
//        if (n1 > 25 && n2 > 25 ) {
//            System.out.println("Ambos números son mayores a 25.");
//        }  
//        else if (n1 > 25) { 
//            System.out.println("El primer número ingresado es mayor a 25."); 
//        }
//        else if (n2 > 25){ 
//            System.out.println("El segundo número ingresado es mayor a 25."); 
//        }
//        else {
//            System.out.println("Ninguno de los dos números es mayor a 25.");
//        }
////////////////////////////////////////////////////////////////////////////////

//////////////////////////////// SWITCH ////////////////////////////////////////          
//        int tipoMotor;
//        
//        System.out.println("Indique el tipo de bomba: ");
//        tipoMotor = leer.nextInt();
//        
//        switch (tipoMotor) {
//            case 1:
//                System.out.println("La bomba es una bomba de agua.");
//                break;
//            case 2:
//                System.out.println("La bomba es una bomba de gasolina.");
//                break;
//            case 3:
//                System.out.println("La bomba es una bomba de hormigón.");
//                break;
//            case 4:
//                System.out.println("La bomba es una bomba de pasta alimenticia.");
//                break;
//            default:
//                System.out.println("No existe una bomba para ese valor.");
//        } 
////////////////////////////////////////////////////////////////////////////////

///////////////////////////////// WHILE ////////////////////////////////////////
//        System.out.println("Ingrese una nota: ");
//        int nota = leer.nextInt();
//        
//        while (nota > 10 || 0 > nota) {
//            System.out.println("La nota ingresada no es válida. Vuelva a intentarlo: ");
//            nota = leer.nextInt();
//        }
//        System.out.println("La nota ingresada es válida.");
////////////////////////////////////////////////////////////////////////////////   

/////////////////////////////// DO-WHILE ///////////////////////////////////////
//        int cuenta = 1;
//        int suma = 0;
//        
//        do {
//            System.out.print("Ingrese un número (");
//            System.out.println(cuenta + "): ");
//            int num = leer.nextInt();
//            
//            cuenta = cuenta + 1;
//            
//            if (num == 0 ) {
//                System.out.println("Se capturó el número 0.");
//                break;
//            }
//            else if (0 < num){
//                suma = suma + num;
//            }
//            
//        } while (cuenta < 21);
//        
//        System.out.println("La suma de los números ingresados es: " + suma);
////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////// FOR ///////////////////////////////////////
//        System.out.println("Ingrese 4 números entre 1 y 20: ");
//        System.out.print("1º: ");
//        int n1 = leer.nextInt();
//        System.out.print("2º: ");
//        int n2 = leer.nextInt();
//        System.out.print("3º: ");
//        int n3 = leer.nextInt();
//        System.out.print("4º: ");
//        int n4 = leer.nextInt();
//        
//        System.out.println("");
//        System.out.print(n1 + " ");
//        for (i = 0; i < n1; i++) {
//            System.out.print("*");
//        }
//        
//        System.out.println("");
//        System.out.print(n2 + " ");
//        for (i = 0; i < n2; i++) {
//            System.out.print("*");
//        }
//        
//        System.out.println("");
//        System.out.print(n3 + " ");
//        for (i = 0; i < n3; i++) {
//            System.out.print("*");
//        }
//        
//        System.out.println("");
//        System.out.print(n4 + " ");
//        for (i = 0; i < n4; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
////////////////////////////////////////////////////////////////////////////////
  }
}
