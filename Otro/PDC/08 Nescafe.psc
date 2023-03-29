Algoritmo Nescafe
// Arreglos: Matrices
//	Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina ofreciendo
//  sus productos. Para tareas administrativas el país está dividido en cinco zonas: Norte,
//	Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas estadísticas
//	sobre el comportamiento de sus representantes en cada zona. Se desea hacer un programa
//	que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.
	
	Definir i,j, matriz, matriz2, suma, sumac, repre, total, veczona, vecvend Como Entero
	Definir sal,  opc, zona Como Caracter
	Dimension matriz[4,5], matriz2[5,4], vecvend[5], veczona[5]
	
	Escribir "Ingrese importe mensual de ventas por zona y representante"
	
	Para i=0 Hasta 3 Hacer
		Para j=0 Hasta 4 Hacer
			matriz[i,j] = Aleatorio(10,99)
			Escribir Sin Saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
	//	suma=0
	sumac = 0
	suma = 0
	Para i=0 Hasta 3 Hacer
		Para j=0 Hasta 4 Hacer
			suma = suma + matriz[i,j]
			veczona[i] = suma
			Escribir Sin Saltar suma " "
		FinPara
		suma = 0
		Escribir ""
	FinPara
	
	suma = 0
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 3 Hacer
			matriz2[i,j]=matriz[j,i]
			suma = suma + matriz2[i,j]
			vecvend[i] = suma
			Escribir Sin Saltar suma " "
		FinPara
		suma = 0
		Escribir ""
	FinPara
	
	Hacer
		
		Escribir "--------------------------------------------------------"
		Escribir "               Menu Distribuidora Nescafé               "
		Escribir "--------------------------------------------------------"
		Escribir "Ingrese una opcion:"
		Escribir " A - Total ventas por zona"
		Escribir " B - Total ventas por representante"
		Escribir " C - Total ventas de todos los representantes"
		Escribir " D - Salir"
		Leer opc
		opc = Mayusculas(opc)
		total = vecvend[0]+vecvend[1]+vecvend[2]+vecvend[3]
		Segun opc Hacer
			"A": Escribir "Ingrese la zona: Norte(N) Sur(S) Este(E) Oeste(O) Centro(C)"
				Leer zona
				zona=Mayusculas(zona)
				Si zona="N" Entonces
					Escribir "Total de ventas zona Norte: " veczona(0)
				FinSi
				Si zona="S" Entonces
					Escribir "Total de ventas zona Sur: " veczona(1)
				FinSi
				Si zona="E" Entonces
					Escribir "Total de ventas zona Este: " veczona(2)
				FinSi
				Si zona="O" Entonces
					Escribir "Total de ventas zona Oeste: " veczona(3)
				FinSi
				Si zona="C" Entonces
					Escribir "Total de ventas zona Centro: " veczona(4)
				FinSi
			"B": Escribir "Ingrese Numero de presentante: 1-2-3-4 "
				Leer repre
				Si repre=1 Entonces
					Escribir "Total de ventas representante uno(1): " vecvend(0)
				FinSi
				Si repre=2 Entonces
					Escribir "Total de ventas representante dos(2): " vecvend(1)
				FinSi
				Si repre=3 Entonces
					Escribir "Total de ventas representante tres(3): " vecvend(2)
				FinSi
				Si repre=4 Entonces
					Escribir "Total de ventas representante cuatro(4): " vecvend(3)
				FinSi
				
			"C":Escribir "Total de ventas de todos los presentantes: " total
				
		FinSegun
		Si opc="D" Entonces
			Escribir "Presione una tecla para abondanar el sistema"
		SiNo
			Escribir "Ingrese una tecla prara continuar"
		FinSi
		Esperar Tecla
	Mientras Que opc <> "D"
FinAlgoritmo