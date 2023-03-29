//Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
//entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
//ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
//variable de tipo lógico.

Algoritmo sin_titulo
	Definir n1,n2,n3 Como Entero
	Definir parametro Como Logico
	
	Escribir "Ingrese la primera nota:"
	Leer n1
	Escribir "Ingrese la segunda nota:"
	Leer n2
	Escribir "Ingrese la tercera nota:"
	Leer n3
	
	Si n1 >= 1 Y n1 <= 10 Y n2 >= 1 Y n2 <= 10 y n3 >= 1 Y n3 <= 10  Entonces 
		parametro = Verdadero
	Sino 
		parametro = falso
	FinSi
	
	Escribir parametro
	
FinAlgoritmo
