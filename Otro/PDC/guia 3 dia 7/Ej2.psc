//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
//n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial.

Algoritmo sin_titulo
	Definir limite,nro,suma Como Entero
	
	Escribir "Ingrese un valor l�mite para la suma:"
	Leer limite 
	
	suma = 0
	
	Mientras suma <> limite Hacer
		Escribir "Ingrese un n�mero:"
		Leer nro
		suma = suma + nro
		Escribir "Suma: ",suma
	FinMientras
	
FinAlgoritmo
