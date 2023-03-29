//Se debe realizar un programa que:
//	1o) Pida por teclado un número (entero positivo).
//	2o) Pregunte al usuario si desea introducir o no otro número.
//	3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
//	4o) Muestre por pantalla la suma de los números introducidos por el usuario.

Algoritmo sin_titulo
	Definir suma,num Como Entero
	Definir respuesta Como Cadena
	
	suma = 0
	
	Hacer
		Escribir "Ingrese un número entero positivo:"
		Leer num
		Escribir "Si desea ingresar otro número, presione Enter; o N para finalizar."
		Leer respuesta
		
		suma = suma + num
		
	Mientras Que respuesta <> "n" Y respuesta <> "N"
	
	Escribir "La suma de los números introducidos es: ",suma
	
FinAlgoritmo
