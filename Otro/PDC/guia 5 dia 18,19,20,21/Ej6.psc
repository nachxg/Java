////Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide desarro-
////llar un programa que:
////	
////	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
////Ayuda: utilizar la función Subcadena de PSeInt.
////	
////	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una posi-
////	ción dentro del arreglo, y el programa debe intentar ingresar el carácter en la posición
////	indicada, si es que hay lugar (es decir la posición está vacía o es un espacio en
////	blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado, de
////	lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.
////Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
////	H o l a m u n d o c r u e l !
////	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////Si se desea ingresar el carácter "%" en la posición 10, entonces el resultado sería:
////		H o l a m u n d o % c r u e l !
////		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

Algoritmo sin_titulo
	Definir frase,vector,car Como Caracter
	Definir i,pos Como Entero
	
	Dimension vector(20)
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	Para i = 0 Hasta 19 Hacer
		vector(i) = Subcadena(frase,i,i)
	FinPara
	
	Escribir "Ingrese un caracter: " 
	Leer car
	Escribir "Ingrese la posición donde desea ingresarlo:"
	Leer pos
	
	Si vector(pos) == " " O vector(pos) == "" Entonces
		vector(pos) = car
		Para i = 0 Hasta 19 Hacer
			Escribir sin saltar vector(i)
		FinPara
	SiNo
		Escribir "La posición está ocupada."
	FinSi
	
	Escribir ""
	
FinAlgoritmo
