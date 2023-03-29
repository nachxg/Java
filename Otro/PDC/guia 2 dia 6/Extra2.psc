//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es 
//válida se debe imprimir la fecha cambiando el número que representa el mes por su
//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".
// 30 dias: 4, 6, 9, 11
// 28 dias: 2

Algoritmo sin_titulo
	Definir dia,mes,aa Como Entero
	
	Escribir "Ingresar una fecha en el sig. formato: DD/MM/AAAA"
	Escribir "Ingrese el día: "
	Leer dia
	Escribir "Ingrese el mes: "
	Leer mes
	Escribir "Ingrese el año: "
	Leer aa
	
	Si dia > 31 O dia < 1 Entonces 
		Escribir "El día ingresado no es válido."
	SiNo
		Si (mes == 4 O mes == 6 O mes == 9 O mes == 11) Y dia > 30 Entonces
			Escribir "El día ingresado no es válido para ese mes."
		SiNo
			Si mes == 2 Y dia > 28 Entonces
				Escribir "El día ingresado no es válido para ese mes."
			SiNo
				Segun mes Hacer
					1: Escribir dia, " de enero de ",aa "."
					2: Escribir dia, " de febrero de ",aa "."
					3: Escribir dia, " de marzo de ",aa "."
					4: Escribir dia, " de abril de ",aa "."
					5: Escribir dia, " de mayo de ",aa "."
					6: Escribir dia, " de junio de ",aa "."
					7: Escribir dia, " de julio de ",aa "."
					8: Escribir dia, " de agosto de ",aa "."
					9: Escribir dia, " de septiembre de ",aa "."
					10: Escribir dia, " de octubre de ",aa "."
					11: Escribir dia, " de noviembre de ",aa "."
					12: Escribir dia, " de diciembre de ",aa "."
					De Otro Modo:
						Escribir "El mes ingresado no es válido."	
				FinSegun	
			FinSi
		FinSi
	FinSi
		
FinAlgoritmo

