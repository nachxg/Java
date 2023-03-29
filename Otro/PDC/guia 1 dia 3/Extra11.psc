//Un alumno desea saber cuál será su calificación final en la materia de Algoritmos. Dicha
//calificación se compone de los siguientes porcentajes:
//	a. 55% del promedio de sus tres calificaciones parciales.
//	b. 30% de la calificación del examen final.
//	c. 15% de la calificación de un trabajo final.

Algoritmo sin_titulo
	Definir p1,p2,p3,f,tf,cf Como Real
	
	Escribir "Ingrese la calificación de su primer parcial:"
	Leer p1
	Escribir "Ingrese la calificación de su segundo parcial:"
	Leer p2
	Escribir "Ingrese la calificación de su tercer parcial:"
	Leer p3
	
	Escribir "Ingrese la calificación de su examen final:"
	Leer f
	
	Escribir "Ingrese la calificación de su trabajo final:"
	Leer tf
	
	cf = ( (p1+p2+p3)/3 ) * (55/100) + ( f * 30/100 ) + ( tf * 15/100 )
	
	Escribir "Su calificación final es: ",cf
	
FinAlgoritmo
