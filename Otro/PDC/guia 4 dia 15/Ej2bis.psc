//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo sin_titulo
	Definir dias,min,max,i Como Entero
	
	Escribir "Ingrese la cantidad de d�as a medir:"
	Leer dias
	
	Para i = 1 Hasta dias
		Escribir "Ingrese la temperatura m�nima del d�a n� ",i
		Leer min
		Escribir "Ingrese la temperatura m�xima del d�a n� ",i
		Leer max
		
		Media(min,max)
		
	FinPara
	
FinAlgoritmo

SubProceso Media(min Por Valor, max Por Valor)
	Definir med Como Real
	med = (min + max) / 2
	Escribir "La temperatura media es: ",med " �C"
FinSubProceso
