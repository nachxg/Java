//Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
//entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
//ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la variable de tipo lógico.
Algoritmo sin_titulo
	definir nota1,nota2,nota3, prom Como real 
	Escribir "Ingrese la primera nota 1"
	leer nota1
	Escribir "Ingrese la primera nota 2"
	leer nota2
	Escribir "Ingrese la primera nota 1"
	leer nota3
	
	Si nota1 <= 10 y nota1 <> 0 y nota2 <= 10 y nota2 <> 0 y nota3 <= 10 y nota3 <> 0 Entonces
		escribir "verdadero"
	SiNo
		Escribir "falso"
	Fin Si
FinAlgoritmo
