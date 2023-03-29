Algoritmo Dia18_19_20_21_Guia5_04_04_NotasEstudiantes
//		Arreglos: Vectores
//	Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre
//	0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//  Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//		a) Deficientes 0 - 5
//		b) Regulares 6 - 10
//		c) Buenos 11 - 15
//		d) Excelentes 16 - 20
	
	Definir vector, i, deficientes, regulares, buenos, excelentes Como Entero
	Dimension vector[100]
	
	Para i <- 0 Hasta 99 Hacer
		vector[i] = Aleatorio(0,20)
	FinPara
	
	deficientes = 0
	regulares = 0
	buenos = 0
	excelentes = 0
	
	Para i <- 0 Hasta 99 Hacer
		Segun vector[i] Hacer
			0,1,2,3,4,5:
				deficientes = deficientes + 1
			6,7,8,9,10:
				regulares = regulares + 1
			11,12,13,14,15:
				buenos = buenos + 1
			16,17,18,19,20:
				excelentes = excelentes + 1
		FinSegun
	FinPara
	
	Escribir "<<< De 100 alumnos en total >>>"
	Escribir "* ", deficientes, " obtuvieron resultados deficientes (0-5)"
	Escribir "* ", regulares, " obtuvieron resultados regulares (6-10)"
	Escribir "* ", buenos," obtuvieron resultados buenos (11-15)"
	Escribir "* ", excelentes," obtuvieron resultados excelentes (16-20)"
	
FinAlgoritmo