//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//bisiesto. Nota: recuerde la funci�n mod de PseInt

Algoritmo sin_titulo
	Definir aa Como Entero
	
	Escribir "Ingrese un a�o: "
	Leer aa
	
	Si (aa MOD 4 == 0) Y (aa MOD 100 <> 0) Entonces
		Escribir "El a�o ingresado es bisiesto."
	SiNo
		Si (aa MOD 4 == 0) Y (aa MOD 400 == 0) Entonces
			Escribir "El a�o ingresado es bisiesto."
		SiNo
			Escribir "El a�o ingresado no es bisiesto."
		FinSi
	FinSi

FinAlgoritmo
