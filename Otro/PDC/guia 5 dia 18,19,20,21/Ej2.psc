////Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
////muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arre-
////glo.

Algoritmo sin_titulo
	Definir vector,suma,resta,mult Como Real
	Definir i Como Entero
	
	suma = 0
	resta = 0
	mult = 1
	
	Dimension vector(10)
	
	Para i = 0 Hasta 9 Hacer
		Escribir "Ingrese un número:"
		Leer vector(i)
		suma = suma + vector(i)
		mult = mult * vector(i)
		resta = resta - vector(i)
	FinPara
	
	Escribir "Suma: ",suma
	Escribir "Multiplicación: ",mult
	Escribir "Resta: ",resta
	
FinAlgoritmo