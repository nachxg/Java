//Realizar un programa que pida un número y determine si ese número es par o impar.
//Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
//la función mod de PseInt.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un número:"
	Leer nro
	
	Si nro MOD 2 == 0 Entonces
		Escribir "El número ingresado es par."
	SiNo
		Escribir "El número ingresado es impar."
	FinSi
	
FinAlgoritmo