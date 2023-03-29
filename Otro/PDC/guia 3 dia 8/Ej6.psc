//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//de los siguientes valores: 2+4+6+8+10.

Algoritmo sin_titulo
	Definir n,suma,cont,suma2 Como Entero
	
	suma = 0
	cont = 0
	
	
	Escribir "Ingrese un número:"
	Leer n
	
	Hacer 
		
		suma = n * (n + 1)
		cont = cont + 1
		
	Mientras Que cont <= n
	
	Escribir "La suma es: ",suma
	
FinAlgoritmo
