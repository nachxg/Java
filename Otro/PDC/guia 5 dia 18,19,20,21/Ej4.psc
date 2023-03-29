////Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
////que ingrese la opción Salir:
////	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
////	usando la función Aleatorio(valorMin, valorMax) de PseInt.
////	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
////	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
////		a elemento. Ejemplo: C = A + B
////	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
////		elemento. Ejemplo: C = B - A
////	E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
////		A, B, o C.
////	F. Salir.

////NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
////		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
////vez.

Algoritmo sin_titulo
	
	Definir op,op2 Como Caracter
	Definir vecA,vecB,vecC,vecD,n Como Entero
	Definir salida Como Logico
	salida = Falso
	
	Escribir "Ingrese el tamaño del vector:"
	Leer n
	
	Dimension vecA(n)
	Dimension vecB(n)
	Dimension vecC(n)
	Dimension vecD(n)
	
	Hacer
		
		Escribir "Ingrese una opción:"
		Escribir "A. Llenar Vector A."
		Escribir "B. Llenar Vector B."
		Escribir "C. Llenar Vector C (suma)."
		Escribir "D. Llenar Vector C (resta)."
		Escribir "E. Mostrar."
		Escribir "F. Salir."
		Leer op
		
		Segun Mayusculas(op) Hacer
			"A": vectorA(vecA,n)
			"B": vectorB(vecB,n)
			"C": vectorC(vecA,vecB,vecC,n)
			"D": vectorD(vecA,vecB,vecC,n)
			"E": muestra(vecA,vecB,vecC,n)
			"F": 
				Escribir "¿Desea salir? - S/N"
				Leer op2
				Si Mayusculas(op2) == "S" Entonces
					Escribir "Hasta luego."
					salida = Verdadero
				FinSi
				
			De Otro Modo:
				Escribir "El valor ingresado es incorrecto. Vuelva a intentarlo."
		FinSegun
		
	Mientras Que salida == Falso
	
FinAlgoritmo

SubProceso vectorA(vecA,n Por Referencia)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vecA(i) = Aleatorio(-100,100)
		Escribir sin saltar vecA(i) " "
	FinPara
	Escribir ""

FinSubProceso

SubProceso vectorB(vecB,n Por Referencia)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vecB(i) = Aleatorio(-100,100)
		Escribir sin saltar vecB(i) " "
	FinPara
	Escribir ""

FinSubProceso

SubProceso vectorC(vecA,vecB,vecC,n Por Referencia)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vecC(i) = vecA(i) + vecB(i)
		Escribir sin saltar vecC(i) " "
	FinPara	
FinSubProceso	

SubProceso vectorD(vecA,vecB,vecC,n Por Referencia)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vecC(i) = vecA(i) - vecB(i)
		Escribir sin saltar vecC(i) " "
	FinPara	
FinSubProceso

SubProceso muestra(vecA,vecB,vecC,n por referencia)
	Definir op Como Caracter
	Definir i Como Entero

	Escribir "¿Qué vector desea visualizar?"
	Escribir "A. Vector A."
	Escribir "B. Vector B."
	Escribir "C. Vector C."
	Leer op
	
	Segun Mayusculas(op) Hacer
		"A": 
			Escribir "Vector A: "
			Para i = 0 Hasta n-1 Hacer
				Escribir sin saltar vecA(i) " "
			FinPara
			Escribir ""
		"B": 
			Escribir "Vector B: "
			Para i = 0 Hasta n-1 Hacer
				Escribir sin saltar vecB(i) " "
			FinPara
			Escribir ""
		"C":
			Escribir "Vector C: "
			Para i = 0 Hasta n-1 Hacer
				Escribir sin saltar vecC(i) " "
			FinPara
			Escribir ""
	FinSegun

FinSubProceso
	