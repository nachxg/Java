//11. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//	Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir salida Como Logico
	
	Escribir "Ingrese un n�mero:"
	Leer nro
	Escribir "El n�mero ",nro ", �tiene todos sus d�gitos impares? " impar(nro)
	
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
