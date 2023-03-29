//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
//1 día = 24 horas = 1440 minutos = 86400 segundos

Algoritmo sin_titulo
	Definir dias,hs,min,seg Como Real
	
	Escribir "Ingrese la cantidad de días: "
	Leer dias
	
	hs = dias * 24
	min = dias * 1440
	seg = dias * 86400
	
	Escribir "Horas: ",hs
	Escribir "Minutos: ",min
	Escribir "Segundos: ",seg
	
FinAlgoritmo
