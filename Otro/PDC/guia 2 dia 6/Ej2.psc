//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar".
//Nota: investigar la funci�n mod de PSeInt

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un n�mero:"
	Leer nro
	
	Si nro == 0 Entonces
		Escribir "El n�mero ingresado no es PAR ni IMPAR."
	SiNo
		Si nro MOD 2 == 0 
			Escribir "El n�mero ingresado es PAR."
		SiNo
			Escribir "El n�mero ingresado es IMPAR."
		FinSi
	FinSi
	
FinAlgoritmo
