//Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
//numero2. A continuación, se deben crear los siguientes métodos:
//
//Método constructor con todos los atributos pasados por parámetro.
//Método constructor sin los atributos pasados por parámetro.
//Métodos get y set.
//Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
//en los atributos del objeto.
//Método sumar(): calcular la suma de los números y devolver el resultado al main.
//Método restar(): calcular la resta de los números y devolver el resultado al 
//main
//Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
//si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario 
//el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//Método dividir(): primero valida que no se haga una división por cero, si fuera 
//a pasar una división por cero, el método devuelve 0 y se le informa al usuario 
//el error se le informa al usuario. Si no, se hace la división y se devuelve el 
//resultado al main.

package ej.pkg3.operaciones;
import Entidad.Operacion;
public class Ej3Operaciones {

    public static void main(String[] args) {
        
        Operacion op1 = new Operacion(0,0);
        op1.crearOperacion();
        
        System.out.println("Los valores elegidos son: ");
        System.out.println("Número 1: " + op1.getN1());
        System.out.println("Número 2: " + op1.getN2());
        System.out.println("La suma entre ambos números da: " + op1.suma());
        System.out.println("La resta entre ambos números da: " + op1.resta());
        
        if (op1.getN1() == 0 || op1.getN2() == 0) {
            System.out.println("Uno de los dos números es 0, por lo tanto la multiplicación entre ambos da: 0");
        } else { 
            System.out.println("La multiplicacion entre ambos números da: " + op1.multiplicacion());
        }
        
        if (op1.getN2() == 0) {
            System.out.println("No se puede dividir por 0. Return = " + op1.division());
        } else {
            System.out.println("La división entre ambos números da: " + op1.division());
        }   
    }
}
