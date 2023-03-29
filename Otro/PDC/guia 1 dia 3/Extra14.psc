//Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
//invertido. Ejemplo, si se introduce 23 que muestre 32.

Algoritmo sin_titulo
	Definir nro,inv Como Entero
	Definir u,d Como Real
	
	Escribir "Ingrese un número de dos cifras: "
	Leer nro
	
	u = nro % 10
	nro = TRUNC(nro / 10)
	d = nro % 10
	nro = TRUNC(nro / 10)
	
	inv = (u * 10 + d)
	
	Escribir "El número invertido es: ",inv
	
FinAlgoritmo
