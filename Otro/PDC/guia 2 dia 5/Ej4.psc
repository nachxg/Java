//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
//Concatenar() de PseInt.

Algoritmo sin_titulo
	Definir frase Como Cadena
	
	Escribir "Ingrese una frase de 4 caracteres:"
	Leer frase
	
	Si Longitud(frase) == 4 Entonces
		Escribir Concatenar(frase,"!")
	SiNo
		Escribir Concatenar(frase,"?")
	FinSi
	
FinAlgoritmo
