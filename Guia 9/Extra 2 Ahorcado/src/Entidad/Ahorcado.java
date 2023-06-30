//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
//contener como atributos, un vector con la palabra a buscar, la cantidad de 
//letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
//Definir los siguientes métodos en AhorcadoService:
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
//letra de la palabra en un índice del vector. Y también, guarda la cantidad de 
//jugadas máximas y el valor que ingresó el usuario.
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
//Nota: buscar como se usa el vector.length.
//Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
//si la letra ingresada es parte de la palabra o no. También informará si la letra 
//estaba o no.
//Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
//muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
//además deberá devolver true si la letra estaba y false si la letra no estaba,
//ya que, cada vez que se busque una letra que no esté, se le restará uno a sus 
//oportunidades.
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
//Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra 
//o se quede sin intentos. Este método se llamará en el main.
package Entidad;

public class Ahorcado {
    
    private int n;
    private String[] palabra = new String[n];
    private int jugadasMax;
    private int contador = 0;
    private String letra;

    public Ahorcado() {
    }

    public Ahorcado(int n, int jugadasMax, int contador, String letra) {
        this.n = n;
        this.jugadasMax = jugadasMax;
        this.contador = contador;
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
  
}
