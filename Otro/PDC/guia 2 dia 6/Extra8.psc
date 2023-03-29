//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo

//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//	realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//	empleado.

//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//	hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//	esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//	como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//	del valor de venta total.
//	
//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//	hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//	horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//	hora. Realizar un menú

Algoritmo sin_titulo
	Definir modalidad Como Caracter
	Definir ventas,salario,horas,extra Como Real
	
	Escribir "Ingrese la letra correspondiente a su modalidad de sueldo:"
	Escribir "A) Comisión"
	Escribir "B) Salario fijo + comisión"
	Escribir "C) Salario fijo"
	Leer modalidad
	
	Segun modalidad Hacer
		"A","a": 
			Escribir "Ingrese el monto total de las ventas realizadas en la semana."
			Leer ventas
			Escribir "Su sueldo es de: $",ventas * 40/100
		"B","b":
			Escribir "Ingrese su salario por hora:"
			Leer salario
			Escribir "Ingrese la cantidad de horas trabajadas en la semana:"
			Leer horas
			Si horas > 40 Entonces
				Escribir "El valor ingresado no es válido. No se pueden exceder las 40 horas semanales."
			SiNo
				Escribir "Ingrese el monto total de las ventas de la semana:"
				Leer ventas
				Escribir "Su sueldo es de: $",(salario * horas) + (ventas * 25/100) 
			FinSi
		"C","c":
			Escribir "Ingrese su salario por hora:"
			Leer salario
			Escribir "Ingrese la cantidad de horas trabajadas en la semana:"
			Leer horas
			Si horas > 40 Entonces
				extra = horas - 40 
				Escribir "Su sueldo es de: $", ((horas - extra) * salario ) + (extra * (salario + salario / 2))
			SiNo
				Escribir "Su sueldo es de: $",horas * salario
			FinSi
		De Otro Modo:
			Escribir "El caracter ingresado no es válido."
	FinSegun

	
FinAlgoritmo
