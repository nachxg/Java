//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:
//	*****
//	****
//	***
//	**
//  *

Algoritmo sin_titulo
	Definir i,j,altura Como Entero
	
	Escribir "Ingrese la altura de la escalera:"
	Leer altura
	
	Para i = 1 Hasta altura Hacer
		
		Escribir " "
		
		Para j = 0 Hasta altura - i Hacer
			Escribir sin saltar "*"
		FinPara
		
	FinPara
	
	Escribir " "
	
FinAlgoritmo
