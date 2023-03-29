Algoritmo Dia22_23_24_25_Guia5_04_07_EmpresaVentaProductosPorCorreo
// Arreglos: Matrices
//	Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//	realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 productos
//  en los 5 días hábiles de la semana. Se desea conocer:
//		a) Total de ventas por cada día de la semana.
//		b) Total de ventas de cada producto a lo largo de la semana.
//		c) El producto más vendido en cada semana.
//		d) El nombre, el día de la semana y la cantidad del producto más vendido.
//  El informe final tendrá un formato como el que se muestra a continuación:
//		| 					   | Lunes | Martes | Miércoles | Jueves | Viernes | Total producto
//		| Producto 1           |       |       |           |        |         |
//		| Producto 2           |       |       |           |        |         |
//		| Producto 3           |       |       |           |        |         |
//		| Producto 4           |       |       |           |        |         |
//		| Producto 5           |       |       |           |        |         |
//		| Total semana	   	   |       |       |           |        |         |
//		| Producto más vendido |       |       |           |        |         |
	
	Definir matriz, matriz2, i, j, dia, dia2, suma, sumac, mas, vec, vec2 Como Entero
	Definir day, prod Como Caracter
	
	Dimension matriz[5,5], matriz2[5,5], dia[5,5], dia2[5,5], vec[5], vec2[5]
	
	mas = 0
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			matriz[i,j] = Aleatorio(10,99)  //carga aleatorio de los datos en matriz
			si matriz[i,j] > mas Entonces
				mas = matriz[i,j]  //mayor valor ingresado en matriz
				Segun j Hacer
					0: day = "Lunes"
					1: day = "Martes"
					2: day = "Miercoles"
					3: day = "Jueves"
					4: day = "Viernes"
				FinSegun                    //guardo ubicacion del mayor valor
				Segun i Hacer
					0: prod = "Producto 1"
					1: prod = "Producto 2"
					2: prod = "Producto 3"
					3: prod = "Producto 4"
					4: prod = "Producto 5"
				FinSegun
			FinSi
		FinPara
	FinPara
	
	suma = 0
	sumac = 0
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			suma = suma + matriz[i,j]  //suma filas de la matriz
			vec[i] = suma
			sumac = sumac + matriz[j,i]  //suma columnas de la matriz
			vec2[i] = sumac
		FinPara
		sumac = 0
		suma = 0
		Escribir ""
	FinPara
	
	Escribir "-----------------------------------------------------------------------"
	Escribir "                 Informe final de ventas semanales                     "
	Escribir "-----------------------------------------------------------------------"
	Escribir "            Lunes   Martes  Miercoles  Jueves  Viernes  Total Producto"
	
	Para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar "Producto  " i+1 ":  "
		Para j = 0 Hasta 4 Hacer
			Escribir Sin Saltar matriz[i,j] "       "
		FinPara
		Escribir " " vec[i]    //armado del informe final en pantalla
		Escribir ""
	FinPara
	Escribir Sin Saltar "Total dia :   "
	suma = 0
	Para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar vec2[i]  "      "
		suma = suma + vec2[i]
	FinPara
	Escribir suma
	Escribir ""
	Escribir ""
	Escribir "Producto más "
	Escribir "vendido      " mas " unidades del " prod " el Dia " day "  "
	Escribir "-----------------------------------------------------------"
	Escribir ""
FinAlgoritmo