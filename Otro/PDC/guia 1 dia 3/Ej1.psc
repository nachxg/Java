//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.

Algoritmo sin_titulo
	Definir ninos,ninas Como Entero
	Definir porc_ninos,porc_ninas Como Real
	
	Escribir "Ingrese la cantidad de ni�os: "
	Leer ninos
	
	Escribir "Ingrese la cantidad de ni�as: "
	Leer ninas
	
	porc_ninas = ninas * 100 / ( ninos + ninas )
	porc_ninos = ninos * 100 /( ninos + ninas )
	
	Escribir "Porcentaje de ni�os: ",porc_ninos "%"
	Escribir "Porcentaje de ni�as: ",porc_ninas "%"
	
FinAlgoritmo
