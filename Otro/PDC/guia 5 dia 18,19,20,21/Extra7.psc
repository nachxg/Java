////Programe una función que calcule el producto de un arreglo de números enteros. Para esto
////imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
////igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo sin_titulo
	Definir vector,n,i Como Entero
	
	Escribir "Ingrese el tamaño del vector:"
	Leer n
	
	Dimension vector(n)
	
	Escribir "Ingrese los valores del vector:"
	
	Para i = 0 Hasta n-1 Hacer
		Leer vector(i)
	FinPara
	
	Escribir "El producto entre los valores del vector es: ",producto(vector,n)
	
FinAlgoritmo

Funcion prod = producto(vector,n)
	Definir prod,i Como Entero
	prod = 1
	
	Para i = 0 Hasta n-1 Hacer
		prod = vector(i) * prod
	FinPara
	
FinFuncion	