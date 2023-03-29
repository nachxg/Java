//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un
//curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//igual a 70; y reprueba en caso contrario.

Algoritmo sin_titulo
	Definir n1,n2,n3 Como Entero
	Definir promedio Como Real
	
	Escribir "Ingrese la primera nota:"
	Leer n1
	Escribir "Ingrese la segunda nota:"
	Leer n2
	Escribir "Ingrese la tercera nota:"
	Leer n3 
	
	promedio = (n1 + n2 + n3) / 3
	
	Si promedio >= 70 Entonces
		Escribir "El alumno está APROBADO."
	SiNo
		Escribir "El alumno esta REPROBADO."
	FinSi
	
FinAlgoritmo
