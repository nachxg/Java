Algoritmo Dia18_19_20_21_Guia5_04_05_HolaMundoCruelExtra
//		Arreglos: Vectores
//	Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserci�n del car�cter, facilitando
//	un potencial reordenamiento del vector. Digamos que se pide ingresar el car�cter en la
//	posici�n X y la misma est� ocupada, entonces de existir un espacio en cualquier posici�n X-n
//	o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el car�cter
//	en cuesti�n en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	m�s cercano.Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:
//			H o l a   m u n d o     c  r  u  e  l  !
//			0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	Si se desea ingresar el car�cter "%" en la posici�n 8, el resultado con desplazamiento ser�a:
//			h o l a    m u n % d o     c  r  u  e   l  !
//			0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	Nota: El desplazamiento se hizo hacia la izquierda porque el espacio de la posici�n 10 estaba
//	m�s cerca de la posici�n 8 que el espacio de la posici�n 4.
	
	Definir vectorA, vectorB, frase, caract Como Caracter
	Definir i, long, posicion, aux1, aux2 Como Entero
	
	Dimension vectorA[20], vectorB[20]
	
	Escribir "Ingrese una frase (m�ximo 20 caracteres):" // Frase
	Leer frase
	
	long = Longitud(frase)
	
	Mientras long > 20 Hacer // Frase pasa los 20 caracteres
		Escribir "La frase ingresada es muy larga.Intente nuevamente."
		Leer frase
		long = Longitud(frase)
	FinMientras
	
	Para i <- 0 Hasta 19 Con Paso 1 Hacer // Llenar vectorA
		Si Subcadena(frase, i, i) <> "" Entonces
			vectorA[i] = Subcadena(frase, i, i)
		SiNo
			vectorA[i] = " "
		FinSi
	FinPara
	
	Escribir "Ingrese el car�cter que desea incluir:"
	Leer caract
	Escribir "Ingrese posici�n en la que desea incluir su car�cter:"
	Leer posicion
	
	Mientras posicion < 0 o posicion > 19 Hacer // N�mero supera el vector
		Escribir "El n�mero ingresado es invalido.Intente nuevamente"
		Leer posicion
	FinMientras
	
	Para i <- 0 Hasta 19 Con Paso 1 Hacer // Llenar el vectorB
		vectorB[i] = vectorA[i]
	FinPara
	
	Para i <- 0 Hasta (posicion - 1) Con Paso 1 Hacer // Buscar espacio -
		Si vectorA[i] = " " Entonces
			aux1 = i
		FinSi
	FinPara
	
	Para i <- 19 Hasta (posicion + 1) Con Paso -1 Hacer // Buscar espacio +
		Si vectorA[i] = " " Entonces
			aux2 = i
		FinSi
	FinPara
	
	Si aux1 <= aux2 Entonces // Cercania y reemplazo
		Para i <- 0 Hasta (posicion - 1) con paso 1 Hacer // Derecha
			Escribir vectorB[i] Sin Saltar
		FinPara
		vectorB[posicion] = caract
		Escribir vectorB[i] Sin Saltar
		Para i <- (posicion+1) Hasta 19 Con Paso 1 Hacer
			vectorB[i] = vectorA[i-1]
			Escribir vectorB[i] Sin Saltar
		FinPara
		Escribir ""
	SiNo
		Para i <- 19 Hasta (posicion - 1) Con Paso -1 Hacer // Izquierda
			Escribir vectorB[i] Sin Saltar
		FinPara
		vectorB[posicion] = caract
		Escribir vectorB[i] Sin Saltar
		Para i <- (posicion+1) Hasta 0 Con Paso -1 Hacer
			vectorB[i] = vectorA[i-1]
			Escribir vectorB[i] Sin Saltar
		FinPara
	FinSi
	
FinAlgoritmo