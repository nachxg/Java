////Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
////rio. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar tam-
////bi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se en-
////cuentra el valor. En caso de que el n�mero se encuentre repetido dentro del arreglo se deben
////imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso de que el n�mero a buscar no est� adentro del arreglo se debe mostrar
////un mensaje.

Algoritmo sin_titulo
	Definir vector,i,nro,n,cont Como Entero
	Escribir "Ingrese el tama�o del vector:"
	Leer n
	
	cont = 0
	
	Dimension vector(n)
	
	Escribir "Ingrese los valores del vector:"
	
	Para i = 0 Hasta n-1 Hacer
		Leer vector(i)
	FinPara
	
	Escribir "Ingrese un valor a encontrar:"
	Leer nro
	
	Para i = 0 Hasta n-1 Hacer
		Si nro == vector(i) Entonces
			Escribir "El n�mero ingresado est� en la posici�n ",i "."
		SiNo
			cont = cont + 1
		FinSi
		Si cont == n Entonces
			Escribir "El n�mero ingresado no se encontr�."
		FinSi
FinPara

FinAlgoritmo
