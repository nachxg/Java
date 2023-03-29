//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de niños, y la cantidad total de niñas que hay en el curso.

Algoritmo sin_titulo
	Definir ninos,ninas Como Entero
	Definir porc_ninos,porc_ninas Como Real
	
	Escribir "Ingrese la cantidad de niños: "
	Leer ninos
	
	Escribir "Ingrese la cantidad de niñas: "
	Leer ninas
	
	porc_ninas = ninas * 100 / ( ninos + ninas )
	porc_ninos = ninos * 100 /( ninos + ninas )
	
	Escribir "Porcentaje de niños: ",porc_ninos "%"
	Escribir "Porcentaje de niñas: ",porc_ninas "%"
	
FinAlgoritmo
