//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir retorno Como Logico
	
	Escribir "Ingrese un n�mero:"
	Leer nro
	
	retorno = Primo(nro)
	
	Si retorno == Verdadero Entonces
		Escribir "El n�mero ingresado es primo."
	SiNo
		Escribir "El n�mero ingresado no es primo."
	FinSi
	
FinAlgoritmo

Funcion pr = Primo(nro)
	Definir pr Como Logico
	Definir i,cont Como Entero
	cont = 0
	
	Para i = 1 Hasta nro
		
		Si nro MOD i == 0 Entonces
			cont = cont + 1
		FinSi
		
	FinPara
	
	si cont = 2 Entonces
		pr = Verdadero
	SiNo
		pr = Falso
	FinSi
	
FinFuncion
	