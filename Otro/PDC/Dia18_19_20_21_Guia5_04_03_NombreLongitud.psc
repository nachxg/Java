Algoritmo Dia18_19_20_21_Guia5_04_03_NombreLongitud
//		Arreglos: Vectores
//	Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//	almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//	debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
	
	Definir n, i Como Entero
	Definir vectorA Como Caracter
	Definir vectorB Como Real
	
	Repetir
		Escribir "Ingrese el tamaño del vector:"
		Leer n
		Si n <= 0 Entonces
			Escribir "Error, el número ingresado debe ser mayor a 0."
			Leer n
		FinSi
	Hasta Que n > 0
	
	Dimension vectorA[n], vectorB[n]
	
	Para i <- 0 Hasta (n-1) Con Paso 1 Hacer
		Escribir "Ingrese un nombre:"
		Leer vectorA[i]
		vectorB[i] = Longitud(vectorA[i])
	FinPara
	
	Escribir "<<< Registro de Personas >>>"
	Para i <- 0 Hasta (n-1) Con Paso 1 Hacer
		Escribir "* Nombre: ", vectorA[i], " - Longitud del nombre: ", vectorB[i]
	FinPara
	
FinAlgoritmo
