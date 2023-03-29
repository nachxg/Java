//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

Algoritmo sin_titulo
	Definir dias Como Real
	
	Escribir "Ingrese la cantidad de días a medir:"
	Leer dias
	
	Temp(dias)
	
FinAlgoritmo

SubProceso Temp(dias Por Valor)
	Definir min,max Como Real
	Definir i Como Entero
	Para i = 1 Hasta dias
		
		Escribir ""
		Escribir "Ingrese la temperatura mínima del día nº: ",i
		Leer min
		Escribir "Ingrese la temperatura máxima del día nº: ",i
		Leer max
		Escribir ""
		Escribir "La temperatura media del día nº ",i " es: ", (min + max) / 2 "ºC"
		
	FinPara
FinSubProceso