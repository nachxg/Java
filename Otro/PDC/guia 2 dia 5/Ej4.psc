//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
//es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
//programa mostrará después la frase final. Nota: investigar la función Longitud() y
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
