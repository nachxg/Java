//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.

//sueldo base
//comisiones = 10% de las ventas
//sueldo base + comisiones

Algoritmo sin_titulo
	Definir n,i,j Como Entero
	Definir sueldobase,ventas,cobro,comisiones Como Real
	
	comisiones = 0
	
	Escribir "Ingrese el n�mero de vendedores:"
	Leer n
	
	Para i = 1 Hasta n Hacer
		
			Escribir ""
			Escribir "Para vendedor n� ",i ":"
			Escribir "Ingrese el sueldo base:"
			Leer sueldobase
			Escribir "Ingrese la cantidad de ventas que realiz�:"
			Leer ventas
			para j = 1 Hasta ventas Con Paso 1 Hacer
				Escribir "Ingrese el precio de la venta n� ", j ":"
				Leer cobro
				comisiones = comisiones + cobro
			FinPara
			
		Escribir ""
		Escribir "Para vendedor n� ",i ":"
		Escribir "Comisiones: ", 0.1 * (comisiones)
		Escribir "Sueldo final: ", sueldobase + 0.1 * (comisiones)
		
		ventas = 0
		cobro = 0
		sueldobase = 0
		comisiones = 0
		
	FinPara
	
FinAlgoritmo
