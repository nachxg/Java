////	Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
////	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha repre-
////	sentada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que
////	dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores
////	dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo sin_titulo
	Definir dia,mes,anio Como Entero
	
	Escribir "Ingrese el día:"
	Leer dia
	Escribir "Ingrese el mes:"
	Leer mes
	Escribir "Ingrese el año:"
	Leer anio
	
	Escribir "La fecha inicial es: ",dia "/",mes "/",anio
	
	diaAnterior(dia,mes,anio)
	
FinAlgoritmo

Subproceso diaAnterior(dia,mes,anio)
	
	Segun mes Hacer
		1: Si dia = 1 Entonces
				mes = 12
				dia = 31
				anio = anio - 1
			FinSi
		2:	Si dia = 1 Entonces
				mes = mes - 1
				dia = 31
			SiNo
				dia = dia - 1
			FinSi
		3: Si dia = 1 Entonces
				mes = mes - 1
				dia = 28
			SiNo
				dia = dia - 1
			FinSi
		4: Si dia = 1 Entonces
				mes = mes - 1
				dia = 31
			SiNo
				dia = dia - 1
			FinSi
		5: Si dia = 1 Entonces
				mes = mes - 1
				dia = 30
			SiNo
				dia = dia - 1
			FinSi
		6: Si dia = 1 Entonces
				mes = mes - 1
				dia = 31
			SiNo
				dia = dia - 1
			FinSi
		7: Si dia = 1 Entonces
				mes = mes - 1
				dia = 30
			SiNo
				dia = dia - 1
			FinSi
		8: Si dia = 1 Entonces
				mes = mes - 1
				dia = 31
			SiNo
				dia = dia - 1
			FinSi
		9:	Si dia = 1 Entonces
			mes = mes - 1
			dia = 31
			SiNo
			dia = dia - 1
			FinSi
		10: Si dia = 1 Entonces
				mes = mes - 1
				dia = 30
			SiNo
				dia = dia - 1
			FinSi
		11: Si dia = 1 Entonces
				mes = mes - 1
				dia = 31
			SiNo
				dia = dia - 1
			FinSi
		12: Si dia = 1 Entonces
				mes = mes - 1
				dia = 30
			SiNo
				dia = dia - 1
			FinSi
	FinSegun
	
	Escribir "La fecha anterior es: ", dia "/", mes "/", anio
	
FinSubProceso
	