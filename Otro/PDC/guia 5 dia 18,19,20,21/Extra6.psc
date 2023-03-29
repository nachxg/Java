////Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
////su valor más grande.

Algoritmo sin_titulo
	Definir vector,i,n Como Entero
	
	Escribir "Ingrese el tamaño del vector:"
	Leer n
	
	Dimension vector(n)
	
	Escribir "Ingrese los números:"
	
	Para i = 0 Hasta n-1 Hacer
		Leer vector(i)
	FinPara

	Escribir "La resta entre el valor máximo y el mínimo del vector es de: ",maxmin(vector,n)
	
FinAlgoritmo

Funcion resta = maxmin(vector,n)
	Definir max,min,i,resta Como Entero
	max = 0
	min = 0
	
	Para i = 0 Hasta n-1 Hacer
		Si i = 0 Entonces
			min = vector(0)
		SiNo
			Si vector(i) < min Entonces
				min = vector(i)
			FinSi
		FinSi
		Si max < vector(i) Entonces 
			max = vector(i)
		FinSi
	FinPara
	
	resta = max - min
	
FinFuncion
