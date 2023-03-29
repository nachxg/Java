//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//mostrar un mensaje por pantalla indicándolo.

Algoritmo sin_titulo
	Definir sueldoActual,sueldoMinimo Como Entero
	
	Escribir "Ingrese su sueldo actual:"
	Leer sueldoActual
	Escribir "Ingrese el sueldo mínimo:"
	Leer sueldoMinimo
	
	Si sueldoActual > sueldoMinimo Entonces
		Escribir "Su sueldo es mayor al sueldo mínimo."
	SiNo
		Escribir "Su sueldo es menor al sueldo mínimo."
	FinSi
	
FinAlgoritmo
