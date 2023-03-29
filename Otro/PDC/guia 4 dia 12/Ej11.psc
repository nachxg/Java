//11. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//	Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir salida Como Logico
	
	Escribir "Ingrese un número:"
	Leer nro
	Escribir "El número ",nro ", ¿tiene todos sus dígitos impares? " impar(nro)
	
FinAlgoritmo

Funcion salida = impar(numa)
	Definir cont,numb,cont2,i,digito Como Entero
	Definir salida Como Logico
	cont = 0 
	numb = numa
	cont2 = 0
	
	
	Mientras numb<>0 Hacer
		numb= trunc(numb/10)
		cont=cont+1
	Fin Mientras
	
	Para i = 1 hasta cont Hacer
		Mientras numa <> 0 Hacer
		digito = numa Mod 10

		Si digito MOD 2 <> 0 Entonces
			cont2 = cont2 + 1
		FinSi
		numa = TRUNC(numa/10)
		FinMientras
	
		Si cont2 == cont Entonces
			salida = VERDADERO
		SiNo
			salida = Falso
		FinSi
		
	FinPara
	
FinFuncion
