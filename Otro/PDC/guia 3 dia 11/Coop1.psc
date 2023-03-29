//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//	5 *****
//	3 ***
//	11 ***********
//	2 **
//	9 *********

Algoritmo sin_titulo
	Definir n1,n2,n3,n4,n5,i Como Entero
	
	Escribir "Ingrese 5 números comprendidos entre 1 y 20:"
	Leer n1,n2,n3,n4,n5
	i = 0
	
	Mientras n1 >= 1 Y n1 <= 20 Y n2 >= 1 Y n2 <= 20 Y n3 >= 1 Y n3 <= 20 Y n4 >= 1 Y n4 <= 20 Y n5 >= 1 Y n5 <= 20 Y i <> 20 Hacer 
		
		Escribir sin saltar n1 " "
		Para i = 1 Hasta n1 Hacer
			Escribir sin saltar "*"
		FinPara
		Escribir ""
		
		Escribir sin saltar n2 " "
		Para i = 1 Hasta n2 Hacer
			Escribir sin saltar "*"
		FinPara
		Escribir ""
		
		Escribir sin saltar n3 " "
		Para i = 1 Hasta n3 Hacer
			Escribir sin saltar "*"
		FinPara
		Escribir ""
		
		Escribir sin saltar n4 " "
		Para i = 1 Hasta n4 Hacer
			Escribir sin saltar "*"
		FinPara
		Escribir ""
		
		Escribir sin saltar n5 " "
		Para i = 1 Hasta n5 Hacer
			Escribir sin saltar "*"
		FinPara
		Escribir ""
		
		i = 20
		
	FinMientras

	Si i = 20 Entonces
		Escribir ""
	SiNo
		Escribir "Alguno de los valores ingresados es incorrecto. Vuelva a intentarlo."
	FinSi
	
FinAlgoritmo
