//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

Algoritmo sin_titulo
	Definir limite,nro,suma Como Entero
	
	Escribir "Ingrese un valor límite para la suma:"
	Leer limite 
	
	suma = 0
	
	Mientras suma <> limite Hacer
		Escribir "Ingrese un número:"
		Leer nro
		suma = suma + nro
		Escribir "Suma: ",suma
	FinMientras
	
FinAlgoritmo
