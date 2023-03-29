//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por pantalla
//un mensaje que indique a qué día de la semana corresponde. Considere que el número 1
//corresponde al día "Lunes", y así sucesivamente.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un número: "
	Leer nro
	
	Segun nro Hacer
		1: Escribir "El número ingresado corresponde al día LUNES."
		2: Escribir "El número ingresado corresponde al día MARTES."
		3: Escribir "El número ingresado corresponde al día MIÉRCOLES."
		4: Escribir "El número Ingresado corresponde al día JUEVES."
		5: Escribir "El número ingresado corresponde al día VIERNES."
		6: Escribir "El número ingresado corresponde al día SÁBADO."
		7: Escribir "El número ingresado corresponde al día DOMINGO."
	De Otro Modo:
		Escribir "El número ingresado no es válido."
	FinSegun
	
FinAlgoritmo
