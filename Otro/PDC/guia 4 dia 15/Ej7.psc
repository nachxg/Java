////Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros co-
////mience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario al
////comenzar. Ejemplo: si se ingresa el n�mero 3:
////1
////12
////123

Algoritmo sin_titulo
	Definir altura Como Entero
	
	Escribir "Ingrese un n�mero:"
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
	