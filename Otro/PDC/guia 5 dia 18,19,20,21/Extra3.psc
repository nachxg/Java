////Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
////debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
////Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo sin_titulo
	Definir nombres Como Cadena
	Definir long,n,i Como Entero
	
	Escribir "Ingrese el tamaño de los vectores:"
	Leer n
	
	Dimension nombres(n)
	Dimension long(n)
	
	Escribir "Ingrese ",n " nombres:"
	Para i = 0 Hasta n-1 Hacer
		Leer nombres(i)
		long(i) = Longitud(nombres(i))
	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		Escribir nombres(i) " " long(i)
	FinPara
	
FinAlgoritmo
