//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe devol-
//ver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener mensajes
//que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo sin_titulo
	Definir nro Como Entero
	Definir retorno Como Logico
	
	Escribir "Ingrese un n�mero:"
	Leer nro
	
	retorno = Impar(nro)
	Si retorno == VERDADERO Entonces
		Escribir retorno
		Escribir "El n�mero ingresado es impar."
	SiNo
		Escribir retorno
		Escribir "El n�mero ingresado es par."
	FinSi
	
FinAlgoritmo

Funcion comp = Impar(nro)
	Definir comp Como Logico
	comp = nro MOD 2 <> 0
FinFuncion
	