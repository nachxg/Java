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
	Definir matriz,masVendido,i,j,sumaP,vectorSumaP,k,l,vectorSumaD,sumaD,masVendidoD Como Entero
	Definir dia,producto,productoD Como Caracter
	masVendidoD = 0
	productoD = ""
	k = 0
	Dimension matriz(5,6),vectorSumaP(5),vectorSumaD(5)
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 5 Hacer
			matriz(i,j) = Aleatorio(100,1000)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			Si matriz(i,j) > masVendidoD Entonces
				masVendidoD = matriz(i,j)
				l = j
				asignarDia(l,dia)
				l = i
				asignarProducto(k,l,producto,productoD)
			FinSi
		FinPara
	FinPara
	
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
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 5 Hacer
			Si j == 5 Entonces
				matriz(i,j) = vectorSumaP(i)
			FinSi
		FinPara
	FinPara
	
	Escribir "         	    Lun    Mar    Mie    Jue    Vie  Total prod."
	
	Para i = 0 Hasta 4 Hacer
		Segun i Hacer
			0: Escribir sin saltar "Producto 1: "
			1: Escribir sin saltar "Producto 2: "
			2: Escribir sin saltar "Producto 3: "
			3: Escribir sin saltar "Producto 4: "
			4: Escribir sin saltar "Producto 5: "
		FinSegun
		Para j = 0 Hasta 5 Hacer
			Escribir sin saltar "|" matriz(i,j) "|  "
		FinPara
		Escribir ""
	FinPara
	Escribir sin saltar " Total día: "

	
	
	Para i = 0 Hasta 4
		Escribir sin saltar "|" vectorSumaD(i) "| "
	FinPara
	
	Escribir ""
	

	masVendido = 0
	Escribir ""
	
	Para i = 0 Hasta 4
		Si vectorSumaP(i) > masVendido Entonces
			masVendido = vectorSumaP(i)
			k = i
			asignarProducto(k,l,producto,productoD)
		FinSi
	FinPara
	
	Escribir "El producto más vendido fue el " productoD " el día " dia " con " masVendidoD " ventas." 
	Escribir "El producto más vendido en la semana fue el " producto " con " masVendido " ventas." 
	
FinAlgoritmo

SubProceso asignarProducto(k Por Referencia,l Por Referencia,producto Por Referencia,productoD Por Referencia)
	
	Segun l Hacer
		0: productoD = "PRODUCTO 1" 
		1: productoD = "PRODUCTO 2" 
		2: productoD = "PRODUCTO 3" 
		3: productoD = "PRODUCTO 4"
		4: productoD = "PRODUCTO 5" 
	FinSegun
	
	Segun k
		0: producto = "PRODUCTO 1" 
		1: producto = "PRODUCTO 2" 
		2: producto = "PRODUCTO 3" 
		3: producto = "PRODUCTO 4"
		4: producto = "PRODUCTO 5" 
	FinSegun

FinSubProceso

SubProceso asignarDia(l Por Referencia,dia Por Referencia)
	Segun l Hacer
		0: dia = "LUNES"
		1: dia = "MARTES"
		2: dia = "MIÉRCOLES"
		3: dia = "JUEVES"
		4: dia = "VIERNES"
	FinSegun
FinSubProceso
	