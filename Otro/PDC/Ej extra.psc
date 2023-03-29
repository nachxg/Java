Algoritmo sin_titulo
	
		definir i,n como entero 
		Definir frase, vector,vector2, carac como cadena
		Dimension vector(20),vector2(20)
		
		Escribir "ingrese una frase " 
		leer frase 
		para i<-0 Hasta 19
			vector(i)=Subcadena(frase,i,i)
			vector2(i)=Subcadena(frase,i,i)
		FinPara
		
		Escribir "ingrese un caracter cualquiera "
		leer carac
		Escribir "ingrese una posicion de la frase " 
		leer n
		vector(n)=carac
		n=n+1
		para i=n hasta 18
			vector(i)=vector2(i-1)
		FinPara
		
		para i<-0 Hasta 19 Hacer
			
			Escribir sin saltar vector(i)
		FinPara
		
FinAlgoritmo

