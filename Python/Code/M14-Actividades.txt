# Actividad 1
#variables de entrada(Radio) 
#Variable de salida longitud
#Primero pedimos el Radio (float)
Radio=float(input("Introduce radio:"))
#y calculamos longitud 1=2*pi*R
#mostrar el resulatado 
print("longitud es =", 2*3.14159*Radio)


#Actividad 2

#Calcular perímetro  de un quadrado 
#Variable de entrada Costado 
#pedimos costado 
costado=float(input("Introduce Costado de Quadrado: "))
#variable de salida Perimetro 
#calcular el area 
#mostrar el resultado 
print("La perímetro del quadrado es: ", costado*4 )



#Actividad 3
#calcular area de un circulo pidiendo radio 
#Variable de entrada Radio 
#Pedimos Radio
radio=float(input("Introduce radio:"))
#Variable de salida area 
#Calcular la area de un circulo
#area de circulo es pi radio quadrado
PI= 3.14159
area = PI * radio * radio
#mostrar el resulatado 
print(" Area de circulo es  = ", area)



#Actividad 4 
#calcula la hipotenusa de un triangle rectangle  pidiendo dos catetos base y altura 
#Variable de entrada base y altura 
#pedimos altura y base 
altura=float(input("Introduce altura:"))
base=float(input("Introduce base:"))
#calculamos la hipotenusa 
hipotenusa = altura * altura + base * base **5
#mostrar el resultado 
print("La hipotenusa es:" , hipotenusa)


# Actividad 5 
#Calcular la Area de un triangulo  pidiendo 2 costados 
#variable de entrada base y altura 
base=float(input("Introduce base:"))
altura=float(input("introduce altura:"))
#calcular la area y mostrar el resultado
print(1/2*base*altura)

#Actividad 6
print("Actividad 6")
#calcular el perimetro de un triangulo pidiendo 2 catetos
#Variable de entrada 
costado1=float(input("Introduce un costado:"))
costado2=float(input("Introduce otro costado:"))
#calcular el perimetro y mostrar el resultado
perimetro= (costado1*2) + costado2
print("El perimetro es:",perimetro)
