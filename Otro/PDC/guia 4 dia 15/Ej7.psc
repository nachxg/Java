////Crear un programa que dibuje una escalera de números, donde cada línea de números co-
////mience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al
////comenzar. Ejemplo: si se ingresa el número 3:
////1
////12
////123

Algoritmo sin_titulo
	Definir altura Como Entero
	
	Escribir "Ingrese un número:"
	Leer altura
	
	Escalera(altura)
	
FinAlgoritmo

SubProceso Escalera(altura)
	Definir i,j Como Entero
	
	Para i = 1 Hasta altura Hacer
		Para j = 1 Hasta i Hacer
			Escribir j Sin Saltar
		FinPara
		Escribir " "
	FinPara
	
	Escribir ""
FinSubProceso
	