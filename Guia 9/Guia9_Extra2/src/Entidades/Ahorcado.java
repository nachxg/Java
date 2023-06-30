package Entidades;

/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos,
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas 
que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
 */
public class Ahorcado {

    private int encontradas;
    private int jugadasM;
    private int n;
    private String letra;
    String[] palabra = new String [n];

    public Ahorcado() {
    }

    public Ahorcado(int encontradas, int jugadasM, int n) {
        this.encontradas = encontradas;
        this.jugadasM = jugadasM;
        this.n = n;
        this.letra=letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasM() {
        return jugadasM;
    }

    public void setJugadasM(int jugadasM) {
        this.jugadasM = jugadasM;
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


}
