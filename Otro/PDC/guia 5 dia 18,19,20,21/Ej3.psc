////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usua-
////rio. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar tam-
////bién debe ser ingresado por el usuario). El programa debe indicar la posición donde se en-
////cuentra el valor. En caso de que el número se encuentre repetido dentro del arreglo se deben
////imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso de que el número a buscar no está adentro del arreglo se debe mostrar
////un mensaje.

Algoritmo sin_titulo
	Definir vector,i,nro,n,cont Como Entero
	Escribir "Ingrese el tamaño del vector:"
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
			Escribir "El número ingresado está en la posición ",i "."
		SiNo
			cont = cont + 1
		FinSi
		Si cont == n Entonces
			Escribir "El número ingresado no se encontró."
		FinSi
FinPara

FinAlgoritmo
