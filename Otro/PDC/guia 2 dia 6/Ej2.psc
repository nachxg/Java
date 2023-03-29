//Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
//Nota: investigar la función mod de PSeInt

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un número:"
	Leer nro
	
	Si nro == 0 Entonces
		Escribir "El número ingresado no es PAR ni IMPAR."
	SiNo
		Si nro MOD 2 == 0 
			Escribir "El número ingresado es PAR."
		SiNo
			Escribir "El número ingresado es IMPAR."
		FinSi
	FinSi
	
FinAlgoritmo
