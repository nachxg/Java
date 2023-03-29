//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

Algoritmo sin_titulo
	Definir dias,min,max,i Como Entero
	
	Escribir "Ingrese la cantidad de días a medir:"
	Leer dias
	
	Para i = 1 Hasta dias
		Escribir "Ingrese la temperatura mínima del día nº ",i
		Leer min
		Escribir "Ingrese la temperatura máxima del día nº ",i
		Leer max
		
		Media(min,max)
		
	FinPara
	
FinAlgoritmo

SubProceso Media(min Por Valor, max Por Valor)
	Definir med Como Real
	med = (min + max) / 2
	Escribir "La temperatura media es: ",med " ºC"
FinSubProceso
