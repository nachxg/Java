//Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
//ingresará diez números.

Algoritmo sin_titulo
	Definir nro,sumapares,sumaimpares,cont,cantpares,cantimpares Como Real
	
	cantpares = 0
	cantimpares = 0
	sumaimpares = 0
	sumapares = 0
	cont = 0
	
	Hacer
		Escribir "Ingrese un número:"
		Leer nro
		
		Si nro MOD 2 == 0 Entonces
			sumapares = sumapares + nro
			cantpares = cantpares + 1
		SiNo
			sumaimpares = sumaimpares + nro
			cantimpares = cantimpares + 1
		FinSi
		
		cont = cont + 1
		
	Mientras Que cont < 10
	
	Escribir "El promedio de los números pares ingresados es: ",sumapares / cantpares
	Escribir "El promedio de los números impares ingresados es: ",sumaimpares / cantimpares
	
FinAlgoritmo
