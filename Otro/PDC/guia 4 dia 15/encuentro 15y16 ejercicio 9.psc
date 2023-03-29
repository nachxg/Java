////Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales repetidas.
////Al final el procedimiento mostrará la frase final.
////Por ejemplo:
////Entrada: "Habia una vez un barco"
////Salida: "Habi un vez n brco"
////Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? que-
////dan al no estar repetidas.
Algoritmo deleteando
	Definir frase Como Caracter
	Escribir " Escriba una frase "
	Leer frase
	remover(frase)
FinAlgoritmo
SubProceso remover(frase)
	Definir almacen, a Como caracter
	Definir i, uno, dos, tres, cuatro, cinco Como Entero
	uno=0
	dos=0
	tres=0
	cuatro=0
	cinco=0
	para i=Longitud(frase) hasta 0 Hacer
		almacen=Subcadena(frase,Longitud(frase)-i,Longitud(frase)-i)
		si (almacen<>"a") y (almacen<>"e") y (almacen<>"i") y (almacen<>"o") y (almacen<>"u") Entonces
			Escribir Sin Saltar almacen
		FinSi
		si almacen="a" Entonces
			uno=uno+1
			si uno=1 Entonces
				escribir Sin Saltar almacen
			SiNo
				Escribir Sin Saltar ""
			FinSi
		SiNo
			si almacen="e" Entonces
				dos=dos+1
				si dos=1 Entonces
					escribir Sin Saltar almacen
				sino
					Escribir sin saltar ""
				FinSi
			SiNo
				si almacen="i" Entonces
					tres=tres+1
					si tres=1 Entonces
						escribir Sin Saltar almacen
					sino
						Escribir sin saltar ""
					FinSi
				SiNo
					si almacen="o" Entonces
						cuatro=cuatro+1
						si cuatro=1 Entonces
							escribir Sin Saltar almacen
						sino
							Escribir sin saltar ""
						FinSi
					SiNo
						si almacen="u" Entonces
							cinco=cinco+1
							si cinco=1 Entonces
								escribir Sin Saltar almacen
							sino
								Escribir sin saltar ""
							FinSi
						finsi
					finsi
				FinSi
			FinSi
		FinSi
		
	FinPara
	
	Escribir " "
FinSubProceso
	