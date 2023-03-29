//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
//numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable.
//Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
//máximo entre estos números será 5. Si luego ingreso el número 2, se evalúa 2 > 5 lo que
//resultará falso y por lo tanto el valor 5 de numero Maximo no se reemplaza. Una lógica
//similar tendrá el mínimo.

Algoritmo sin_titulo
	Definir nro,nroMaximo,nroMinimo,cont,suma Como Entero
	
	nroMaximo = 0
	cont = 0
	
	Escribir "Ingrese un número entero:"
	Leer nroMinimo
	nroMaximo = nroMinimo
	suma = nroMinimo
	
	Hacer
		Escribir "Ingrese un número entero:"
		Leer nro
		
		Si nro > nroMaximo Entonces
			nroMaximo = nro
		SiNo
			Si nro < nroMinimo Y nro <> 0 Entonces
				nroMinimo = nro
			FinSi
		FinSi
		
		suma = suma + nro
		cont = cont + 1
	Mientras Que nro <> 0
	
	Escribir "El número máximo es:",nroMaximo
	Escribir "El número mínimo es:",nroMinimo
	Escribir "El promedio de los números ingresados es:", suma / (cont)
	
FinAlgoritmo
