//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.

Algoritmo sin_titulo
	Definir n1,n2,n3,n4,promedio Como Real
	
	Escribir "Ingrese la primera nota:"
	Leer n1
	Escribir "Ingrese la segunda nota:"
	Leer n2
	Escribir "Ingrese la tercera nota:"
	Leer n3
	Escribir "Ingrese la cuarta nota:"
	Leer n4
	
	Si n1 < n2 Y n1 < n3 Y n1 < n4 Entonces
		promedio = (n2 + n3 + n4) / 3
		Escribir "El promedio es: ",promedio
	SiNo
		Si n2 < n1 Y n2 < n3 Y n2 < n4 Entonces
			promedio = (n1 + n3 + n4) / 3
			Escribir "El promedio es: ",promedio
		SiNo
			Si n3 < n1 Y n3 < n2 Y n3 < n4 Entonces
				promedio = (n1 + n2 + n4) / 3
				Escribir "El promedio es: ",promedio
			SiNo
				promedio = (n1 + n2 + n3) / 3
				Escribir "El promedio es: ",promedio
			FinSi
		FinSi
	FinSi
FinAlgoritmo
