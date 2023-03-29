//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable.
//Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
//m�ximo entre estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2 > 5 lo que
//resultar� falso y por lo tanto el valor 5 de numero Maximo no se reemplaza. Una l�gica
//similar tendr� el m�nimo.

Algoritmo sin_titulo
	Definir nro,nroMaximo,nroMinimo,cont,suma Como Entero
	
	nroMaximo = 0
	cont = 0
	
	Escribir "Ingrese un n�mero entero:"
	Leer nroMinimo
	nroMaximo = nroMinimo
	suma = nroMinimo
	
	Hacer
		Escribir "Ingrese un n�mero entero:"
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
	
	Escribir "El n�mero m�ximo es:",nroMaximo
	Escribir "El n�mero m�nimo es:",nroMinimo
	Escribir "El promedio de los n�meros ingresados es:", suma / (cont)
	
FinAlgoritmo
