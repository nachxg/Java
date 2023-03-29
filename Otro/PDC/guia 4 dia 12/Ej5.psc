//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir retorno Como Logico
	
	Escribir "Ingrese un número:"
	Leer nro
	
	retorno = Primo(nro)
	
	Si retorno == Verdadero Entonces
		Escribir "El número ingresado es primo."
	SiNo
		Escribir "El número ingresado no es primo."
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
	