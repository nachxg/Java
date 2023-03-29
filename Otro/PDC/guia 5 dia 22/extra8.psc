Algoritmo sin_titulo
	
	Definir op,op2 Como Caracter
	Definir salir Como Logico
	Definir matriz2,matriz,norte,sur,este,oeste,centro,rep1,rep2,rep3,rep4,total Como Entero
	
	Dimension matriz(4,6),matriz2(4,5)
	
	salir = FALSO
	
	Hacer
	Escribir "--------------------------------------------------------"
	Escribir "               Menu Distribuidora Nescafé               "
	Escribir "--------------------------------------------------------"
	Escribir "Ingrese una opcion:"
	Escribir " A - Ingresar ventas"
	Escribir " B - Total ventas por zona"
	Escribir " C - Total ventas por representante"
	Escribir " D - Total ventas de todos los representantes"
	Escribir " E - Salir"
	
	Leer op
	
		Segun Mayusculas(op) Hacer
			"A": ingresarVentas(matriz,norte,sur,este,oeste,centro,salir,rep1,rep2,rep3,rep4,total)
			"B": totalZona(matriz,norte,sur,este,oeste,centro)
			"C": totalRep(matriz,rep1,rep2,rep3,rep4)
			"D": totalGeneral(matriz,total)
			"E": Escribir "¿Desea salir? S/N"
				Leer op2
				Segun Mayusculas(op2) Hacer
					"S": Escribir "Hasta luego."
						salir = Verdadero
					"N": Limpiar Pantalla 
					De Otro Modo:
						Escribir "Caracter incorrecto."
						Limpiar Pantalla
				FinSegun
			De Otro Modo:
				Escribir "Caracter incorrecto."
		FinSegun
		
	Mientras Que salir == Falso
	
	
FinAlgoritmo

SubProceso ingresarVentas(matriz,norte Por Referencia,sur Por Referencia,este Por Referencia,oeste Por Referencia,centro Por Referencia,salir Por Referencia,rep1 Por Referencia,rep2 Por Referencia,rep3 Por Referencia,rep4 Por Referencia,total Por Referencia)
	Definir i,j,num Como Entero
	Definir zona Como Caracter
	num = 0
	
	inicializarMatriz(matriz)
	
	norte = 0
	sur = 0
	este = 0
	oeste = 0
	centro = 0
	rep1 = 0
	rep2 = 0 
	rep3 = 0
	rep4 = 0
	
	Para i = 0 Hasta 3
		matriz(i,0) = i+1
		Para j = 0 Hasta 5
			Si j <> 0 Entonces
				matriz(i,j) = Aleatorio(100,1000)
			FinSi
		FinPara
	FinPara
	
	Escribir ""
	Escribir "     |Norte|  |Sur|  |Este|  |Oeste| |Centro|"
	
	Para i = 0 Hasta 3
		Para j = 0 Hasta 5
			Escribir sin saltar "|" matriz(i,j) "|   "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Para i = 0 Hasta 3
		norte = norte + matriz(i,1)
		sur = sur + matriz(i,2)
		este = este + matriz(i,3)
		oeste = oeste + matriz(i,4)
		centro = centro + matriz(i,5)
	FinPara
	
	Para j = 1 Hasta 5
		rep1 = rep1 + matriz(0,j)
		rep2 = rep2 + matriz(1,j)
		rep3 = rep3 + matriz(2,j)
		rep4 = rep4 + matriz(3,j)
	FinPara
	
	total = rep1 + rep2 + rep3 + rep4
	
	Escribir "norte " norte
	Escribir "sur " sur
	Escribir "este " este
	Escribir "oeste " oeste
	Escribir "centro " centro
	
	Escribir "rep1 " rep1
	Escribir "rep2 " rep2
	Escribir "rep3 " rep3
	Escribir "rep4 " rep4
	
	Escribir "total " total

FinSubProceso

SubProceso totalZona(matriz,norte Por Referencia,sur Por Referencia,este por Referencia,oeste Por Referencia,centro Por Referencia)
	Definir zona Como Caracter
	Definir suma,i,j,z Como Entero
	suma = 0
	Escribir "Ingrese la zona de la cual desea saber el total de ventas:"
	Leer zona
	
	Segun Mayusculas(zona) Hacer
		"NORTE": suma = suma + norte
		"SUR": suma = suma + sur
		"ESTE": suma = suma + este
		"OESTE": suma = suma + oeste
		"CENTRO": suma = suma + centro
		De Otro Modo:
			Escribir "Zona no válida. Vuelva a intentarlo."
			totalZona(matriz,norte,sur,este,oeste,centro)
	FinSegun
	
	Escribir "El total de ventas de la zona " zona " es de " suma "."
	
FinSubProceso

Funcion inicializarMatriz(matriz)
	
	definir i, j Como Entero
	
	para i<- 0 hasta 3 Hacer
		para j <- 0 hasta 5 Hacer
			matriz(i,j) = 0
		FinPara
	FinPara
	
FinFuncion

SubProceso totalRep(matriz,rep1 Por Referencia,rep2 por Referencia,rep3 Por Referencia,rep4 Por Referencia)
	Definir op,suma Como Entero
	suma = 0
	
	Escribir "Ingrese el nro. de representante:"
	Leer op
	
	Segun op Hacer
		1: suma = suma + rep1
		2: suma = suma + rep2
		3: suma = suma + rep3
		4: suma = suma + rep4
		De Otro Modo:
			Escribir "Zona no válida. Vuelva a intentarlo."
			totalRep(matriz,rep1,rep2,rep3,rep4)
	FinSegun
	
	Escribir "El total de ventas del representante nº " op " es de " suma "."
	
FinSubProceso

SubProceso totalGeneral(matriz,total Por Referencia)
	Escribir "El total de ventas de todos los representantes es de:" total
FinSubProceso
	