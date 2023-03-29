Algoritmo Dia06_Guia2_03_02_ParImpar
	// Condicionales Anidados
	// Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
	// En caso de que el valor ingresado sea 0, se debe mostrar "El número no es par ni impar".
	
	Definir num Como Entero
	Escribir "Ingrese un número:"
	Leer num
	
	Si num = 0 Entonces
		Escribir "El número elegido no es par ni impar"
	SiNo
		Si num MOD 2 = 0
			Escribir "El número elegido es par"
		SiNo
			Si num MOD 2 <> 0
				Escribir "El número elegido es impar"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
