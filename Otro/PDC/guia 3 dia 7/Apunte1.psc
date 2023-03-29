//Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
//que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
//adivine.

Algoritmo sin_titulo
	Definir vocal Como Caracter
	
	Escribir "Intente adivinar la vocal secreta:"
	Leer vocal
	
	Mientras vocal <> "u" Y vocal <> "U" Hacer
		Escribir "¡Fallaste! Vuelve a intentarlo:"
		Leer vocal
	FinMientras
	
	Escribir "¡Adivinaste!"
	
FinAlgoritmo
