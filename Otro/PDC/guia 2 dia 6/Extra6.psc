//Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
//No DE KILOS COMPRADOS 	% DESCUENTO
//0 - 2							 0
//2.01 - 5						10
//5.01 - 10						15
//10.01 en adelante				20

Algoritmo sin_titulo
	Definir kilos,precio Como Real
	
	Escribir "Ingrese el precio del kilo de manzanas:"
	Leer precio
	Escribir "Ingrese cuántos kilos de manzanas compró:"
	Leer kilos
	
	Si kilos <= 2 Entonces
		Escribir "El precio es: $",precio * kilos
	SiNo
		Si kilos > 2 Y kilos <= 5 Entonces
			Escribir "El precio es: $",precio * kilos - (precio * kilos) * 10/100
		SiNo
			Si kilos > 5 Y kilos <= 10 Entonces
				Escribir "El precio es: $",precio * kilos - (precio * kilos) * 15/100
			SiNo
				Si kilos > 10 Entonces
					Escribir "El precio es: $",precio * kilos - (precio * kilos) * 20/100
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
