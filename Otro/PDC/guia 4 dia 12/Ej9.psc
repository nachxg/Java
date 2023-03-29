//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debe-
//mos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o
//no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.

Algoritmo sin_titulo
	definir nombre,dia,turno,feriado Como Caracter
	Definir tarifa,horas,cant,cont Como real
	cont = 1
	
	Escribir "Ingrese la cantidad de trabajadores:"
	Leer cant
	
	Mientras cont <= cant Hacer
		
		Escribir "Ingrese el nombre del trabajador:"
		Leer nombre
		Escribir "Ingrese el día de la semana:"
		Leer dia
		Escribir "El día ",dia ", ¿corresponde a un día festivo?"
		Leer feriado
		Escribir "Ingrese el turno:"
		Leer turno
		Escribir "Ingrese la cantidad de horas trabajadas:"
		Leer horas
		
		cont = cont + 1
		
		tarifa = Cobro(nombre,dia,feriado,turno,horas)
		
		Si tarifa <> 0 Entonces
			Escribir "A ",nombre " le corresponden: $",tarifa
		FinSi
		
	FinMientras

	
FinAlgoritmo

Funcion tarifa = Cobro(nombre,dia,feriado,turno,horas)
	Definir tarifa Como Real
	tarifa = 0
	
	Segun Mayusculas(turno) Hacer
		
		"DIURNO":
			Si Mayusculas(feriado) == "SI" Entonces
				tarifa = horas * 90 + (horas * 90) * 0.1
			SiNo
				Si Mayusculas(feriado) == "NO" Entonces
					tarifa = horas * 90
				SiNo
					tarifa = 0
				FinSi
			FinSi
			
		"NOCTURNO":
			Si Mayusculas(feriado) == "SI" Entonces
				tarifa = horas * 125 + (horas * 125) * 0.15
			SiNo
				Si Mayusculas(feriado) == "NO" Entonces
					tarifa = horas * 125
				SiNo
					tarifa = 0
				FinSi
			FinSi
			
	De Otro Modo:
		Escribir "Alguno de los valores ingresados es inválido. Vuelva a intentarlo."
	FinSegun
	
FinFuncion
	