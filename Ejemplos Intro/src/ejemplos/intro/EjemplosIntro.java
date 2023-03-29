package ejemplos.intro;
public class EjemplosIntro {
    public static void main(String[] args) {
        byte numerito = 126;
        int entero = 32456;
        double decimal = 32.4;
        char caracter = 'n';
        boolean bandera = true;
        String nombre = "Nacho";
        byte edad = 20;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        System.out.println("Valores iniciales: ");
        System.out.println(numerito);
        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(caracter);
        System.out.println(bandera);
        System.out.println(nombre);
        
        numerito = numerito ++;
        entero = entero - 32455;
        bandera = false;
        decimal = decimal - 0.4;
        nombre = "blablabla";
        caracter = 'f';
        
        System.out.println("Nuevos valores: ");
        System.out.println(numerito);
        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(caracter);
        System.out.println(bandera);
        System.out.println(nombre);

    }
    
}
