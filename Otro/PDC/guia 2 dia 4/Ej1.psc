//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir� al
//usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
//mostrar un mensaje por pantalla indic�ndolo.

Algoritmo sin_titulo
	Definir sueldoActual,sueldoMinimo Como Entero
	
	Escribir "Ingrese su sueldo actual:"
	Leer sueldoActual
	Escribir "Ingrese el sueldo m�nimo:"
	Leer sueldoMinimo
	
	Si sueldoActual > sueldoMinimo Entonces
		Escribir "Su sueldo es mayor al sueldo m�nimo."
	SiNo
		Escribir "Su sueldo es menor al sueldo m�nimo."
	FinSi
	
FinAlgoritmo
