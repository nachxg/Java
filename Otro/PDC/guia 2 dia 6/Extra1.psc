//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por pantalla
//un mensaje que indique a qu� d�a de la semana corresponde. Considere que el n�mero 1
//corresponde al d�a "Lunes", y as� sucesivamente.

Algoritmo sin_titulo
	Definir nro Como Entero
	
	Escribir "Ingrese un n�mero: "
	Leer nro
	
	Segun nro Hacer
		1: Escribir "El n�mero ingresado corresponde al d�a LUNES."
		2: Escribir "El n�mero ingresado corresponde al d�a MARTES."
		3: Escribir "El n�mero ingresado corresponde al d�a MI�RCOLES."
		4: Escribir "El n�mero Ingresado corresponde al d�a JUEVES."
		5: Escribir "El n�mero ingresado corresponde al d�a VIERNES."
		6: Escribir "El n�mero ingresado corresponde al d�a S�BADO."
		7: Escribir "El n�mero ingresado corresponde al d�a DOMINGO."
	De Otro Modo:
		Escribir "El n�mero ingresado no es v�lido."
	FinSegun
	
FinAlgoritmo
