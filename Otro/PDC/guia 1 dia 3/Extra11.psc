//Un alumno desea saber cu�l ser� su calificaci�n final en la materia de Algoritmos. Dicha
//calificaci�n se compone de los siguientes porcentajes:
//	a. 55% del promedio de sus tres calificaciones parciales.
//	b. 30% de la calificaci�n del examen final.
//	c. 15% de la calificaci�n de un trabajo final.

Algoritmo sin_titulo
	Definir p1,p2,p3,f,tf,cf Como Real
	
	Escribir "Ingrese la calificaci�n de su primer parcial:"
	Leer p1
	Escribir "Ingrese la calificaci�n de su segundo parcial:"
	Leer p2
	Escribir "Ingrese la calificaci�n de su tercer parcial:"
	Leer p3
	
	Escribir "Ingrese la calificaci�n de su examen final:"
	Leer f
	
	Escribir "Ingrese la calificaci�n de su trabajo final:"
	Leer tf
	
	cf = ( (p1+p2+p3)/3 ) * (55/100) + ( f * 30/100 ) + ( tf * 15/100 )
	
	Escribir "Su calificaci�n final es: ",cf
	
FinAlgoritmo
