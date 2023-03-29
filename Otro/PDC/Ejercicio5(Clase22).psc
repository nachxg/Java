Algoritmo ejercicio5
	
	Definir matriz, palabra Como caracter	
	Definir i, j, k Como Entero
	
	Dimension matriz(3,3)
	
	Hacer
		Escribir "Indique la palabra: "
		Leer palabra
		
		Si Longitud(palabra) <> 9 Entonces
			Escribir "Su palabra no tiene 9 letras"
			Leer palabra
		FinSi
		
	Mientras Que Longitud(palabra) <> 9
	
	k = 0
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			
			matriz(i,j) = Subcadena(palabra,k,k)
			k = k + 1
			
		FinPara
	FinPara
	
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			
			Escribir Sin Saltar matriz(i,j)
			
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo

