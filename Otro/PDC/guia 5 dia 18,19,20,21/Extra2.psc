//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.


Algoritmo sin_titulo
	definir vecA, n, i, num Como Entero
	Definir suma, prom Como Real
	Escribir "ingrese tamaño"
	leer n
	suma=0
	prom=0
	
	
	
	Dimension vecA(n)
	Para i=0 Hasta n-1 Hacer
		Escribir "ingrese los numeros"
		leer num
		vecA(i)=num
	FinPara
	Para i=0 Hasta n-1 Hacer
		suma=suma+vecA(i)
		
		
	FinPara
	Escribir "la suma es" suma
	
	Escribir "El promedio es" suma/n
	
FinAlgoritmo