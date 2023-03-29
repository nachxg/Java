//Hacer un programa que ingrese por teclado un número total de segundos y que luego
//pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor
//ingresado.

Algoritmo sin_titulo
	Definir hr,min,s,seg Como Real
	
	Escribir "Ingrese una cantidad de segundos:"
	Leer seg
	
	hr = TRUNC(seg / 3600)
	min = TRUNC((seg mod 3600) / 60)
	s = TRUNC(seg mod 60)
	
	Escribir hr, " hr " min, " min " s " seg "
	
FinAlgoritmo
