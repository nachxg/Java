//Se debe realizar un programa que:
//	1o) Pida por teclado un n�mero (entero positivo).
//	2o) Pregunte al usuario si desea introducir o no otro n�mero.
//	3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
//	4o) Muestre por pantalla la suma de los n�meros introducidos por el usuario.

Algoritmo sin_titulo
	Definir suma,num Como Entero
	Definir respuesta Como Cadena
	
	suma = 0
	
	Hacer
		Escribir "Ingrese un n�mero entero positivo:"
		Leer num
		Escribir "Si desea ingresar otro n�mero, presione Enter; o N para finalizar."
		Leer respuesta
		
		suma = suma + num
		
	Mientras Que respuesta <> "n" Y respuesta <> "N"
	
	Escribir "La suma de los n�meros introducidos es: ",suma
	
FinAlgoritmo
