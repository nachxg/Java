//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas vale
//el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres notas
//obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los datos del
//siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben estar
//comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el promedio
//y se mostrar� un mensaje de error.

Algoritmo sin_titulo
	Definir nombre Como Cadena
	Definir practico,problemas,teoria,nota Como Real
	
	Escribir "Ingrese el nombre del alumno: "
	Leer nombre
	
	Mientras nombre <> "" Hacer
		Escribir "Ingrese la nota de la parte pr�ctica:"
		Leer practico
		Si practico < 1 O practico > 10 Entonces
			Escribir "La nota no es v�lida. Vuelva a empezar."
		SiNo
			Escribir "Ingrese la nota de la parte de problemas:"
			Leer problemas
			Si problemas < 1 O problemas > 10 Entonces
				Escribir "La nota no es v�lida. Vuelva a empezar."
			SiNo
				Escribir "Ingrese la nota de la parte te�rica:"
				Leer teoria
				Si teoria < 1 O teoria > 10 Entonces
					Escribir "La nota no es v�lida. Vuelva a empezar."
				SiNo
					nota = (10/100 * practico) + (50/100 * problemas) + (40/100 * teoria)
					Escribir "La nota de ",nombre " es: ",nota
				FinSi
			FinSi
		FinSi
		
		Escribir "Ingrese el nombre del alumno:"
		Leer nombre
		
	FinMientras
FinAlgoritmo
