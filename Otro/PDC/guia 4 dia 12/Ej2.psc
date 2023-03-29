//Realizar una función que valide si un número es impar o no. Si es impar la función debe devol-
//ver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener mensajes
//que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir retorno Como Logico
	
	Escribir "Ingrese un número:"
	Leer nro
	
	retorno = Impar(nro)
	Si retorno == VERDADERO Entonces
		Escribir retorno
		Escribir "El número ingresado es impar."
	SiNo
		Escribir retorno
		Escribir "El número ingresado es par."
	FinSi
	
FinAlgoritmo

Funcion comp = Impar(nro)
	Definir comp Como Logico
	comp = nro MOD 2 <> 0
FinFuncion
	