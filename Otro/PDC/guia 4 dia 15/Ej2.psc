//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo sin_titulo
	Definir dias Como Real
	
	Escribir "Ingrese la cantidad de d�as a medir:"
	Leer dias
	
	Temp(dias)
	
FinAlgoritmo

SubProceso Temp(dias Por Valor)
	Definir min,max Como Real
	Definir i Como Entero
	Para i = 1 Hasta dias
		
		Escribir ""
		Escribir "Ingrese la temperatura m�nima del d�a n�: ",i
		Leer min
		Escribir "Ingrese la temperatura m�xima del d�a n�: ",i
		Leer max
		Escribir ""
		Escribir "La temperatura media del d�a n� ",i " es: ", (min + max) / 2 "�C"
		
	FinPara
FinSubProceso