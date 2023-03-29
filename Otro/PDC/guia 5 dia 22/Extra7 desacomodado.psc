////Una empresa de venta de productos por correo desea realizar una estadística de las ventas
////realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
////tos en los 5 días hábiles de la semana. Se desea conocer:
////	
////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.
////	El informe final tendrá un formato como el que se muestra a continuación:
////
////			Lunes / Martes / Miércoles / Jueves / Viernes / Total producto
////Producto 1
////Producto 2
////Producto 3
////Producto 4
////Producto 5
////Total semana
////Producto más
////vendido

Algoritmo sin_titulo
	Definir matriz,totalProd,totalVentas,masVendido,i,j,sumaP,vectorSumaP,k,l,matrizFinal,vectorSumaD,sumaD Como Entero
	Definir dia,producto Como Caracter
	
	Dimension matriz(5,5),vectorSumaP(5),matrizFinal(5,6),vectorSumaD(5)
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
				matriz(i,j) = Aleatorio(1,1000)
		FinPara
	FinPara
	
	Escribir "         	    Lu / Mar / Mie / Jue / Vie / Total producto"
	
	Para i = 0 Hasta 4 Hacer
		asignarProducto(i,producto)
		Para j = 0 Hasta 4 Hacer
			Escribir sin saltar "(" matriz(i,j) ") "
		FinPara
		Escribir ""
	FinPara
	Escribir "Semana:"

	Para i = 0 Hasta 4
		sumaP = 0
		sumaD = 0
		Para j = 0 Hasta 4
			sumaP = sumaP + matriz(i,j)
			vectorSumaP(i) = sumaP
			sumaD = sumaD + matriz(j,i)
			vectorSumaD(i) = sumaD
		FinPara
	FinPara
	
	Para i = 0 Hasta 4
		Escribir sin saltar vectorSumaD(i) " "
	FinPara
	
	Escribir ""
	
	para i = 0 Hasta 4 Hacer
		Escribir sin saltar vectorSumaP(i) " "
	FinPara
	
	masVendido = 0
	Escribir ""
	
	Para i = 0 Hasta 4
		Si vectorSumaP(i) > masVendido Entonces
			masVendido = vectorSumaP(i)
			k = i
			asignarDia(k,dia)
			asignarProducto(k,producto)
		FinSi
	FinPara
	
	Escribir "El producto más vendido fue el " producto, " el dia " dia " con " masVendido " ventas " 
	
FinAlgoritmo

SubProceso asignarProducto(k Por Referencia,producto Por Referencia)
	Segun k
		0: producto = "Producto 1"
		1: producto = "Producto 2"
		2: producto = "Producto 3"
		3: producto = "Producto 4"
		4: producto = "Producto 5"
	FinSegun
FinSubProceso

SubProceso asignarDia(k Por Referencia,dia Por Referencia)
	Segun k Hacer
		0: dia = "Lunes"
		1: dia = "Martes"
		2: dia = "Miércoles"
		3: dia = "Jueves"
		4: dia = "Viernes"
	FinSegun
FinSubProceso

