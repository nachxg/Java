//Realizar una función que calcule y retorne la suma de todos los divisores del número n distin-
//tos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo sin_titulo
	Definir nro,retorno Como Entero
	
	Escribir "Ingrese un número:"
	Leer nro
	
	retorno = Divisores(nro)
	Escribir "La suma de los divisores de ",nro " es: ",retorno
	
FinAlgoritmo

Funcion div = Divisores(nro)
	
	Definir div,i Como Entero
	div = 0
	
	Para i = 1 Hasta nro
		Si nro MOD i == 0 Y i <> nro Entonces
			div = div + i
		FinSi
	FinPara
	
FinFuncion
	