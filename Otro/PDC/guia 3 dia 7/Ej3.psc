//Dada una secuencia de n�meros ingresados por teclado que finaliza con un ?1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los 
//n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.

Algoritmo sin_titulo
	Definir i,nro,suma Como Real
	Escribir "Ingrese un n�mero:"
	Leer nro
	suma = 0
	i = 0
	
	Mientras nro <> -1 Hacer
		suma = suma + nro
		i = i + 1
		Leer nro
	FinMientras
	
	Escribir "El promedio es: ",suma/i
	
FinAlgoritmo
