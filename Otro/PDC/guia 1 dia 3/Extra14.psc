//Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el n�mero
//invertido. Ejemplo, si se introduce 23 que muestre 32.

Algoritmo sin_titulo
	Definir nro,inv Como Entero
	Definir u,d Como Real
	
	Escribir "Ingrese un n�mero de dos cifras: "
	Leer nro
	
	u = nro % 10
	nro = TRUNC(nro / 10)
	d = nro % 10
	nro = TRUNC(nro / 10)
	
	inv = (u * 10 + d)
	
	Escribir "El n�mero invertido es: ",inv
	
FinAlgoritmo
