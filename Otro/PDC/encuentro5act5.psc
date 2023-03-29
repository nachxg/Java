Algoritmo encuentro5act5
	definir  nota1, nota2, nota3 Como entero
	definir num1, num2, num3, notas como logico
	
	escribir "Ingrese la primer nota"
	leer nota1
	escribir "Ingrese la segunda nota"
	leer nota2
	escribir "Ingrese la tercer nota"
	leer nota3
	
	num1 = (nota1 >= 1) Y (nota1 <= 10)
	num2 = (nota2 >= 1) Y (nota2 <= 10)
	num3 = (nota3 >= 1) Y (nota3 <= 10)
	
	notas = num1 = num2 = num3
	
	si notas Entonces
		escribir "Las tres notas están entre los parárametros, por lo que es " notas
	SiNo
		escribir "¡Es incorrecto!"
	FinSi
FinAlgoritmo
