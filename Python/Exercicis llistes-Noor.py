#Actividad 1
# UNA programa que muestri numeros parells y senars
parells=[]
senars=[]
for i in range(2,102,2):
    print(i)
    parells.append(i)
    senars.append(i-1)
print(parells)
print(senars)

#Actividad 2
#pedir alçada
#crear una lista vacia
alturas=[]
#pedir alturas 3 veces
for i in range(3):
    print("Introduzca altura", i+1, ":", sep="")
    altura=float(input())
    #añadir altura en lista
    alturas.append(altura)
    #mostrar alturas
    print(alturas)
#sumar y hacer media
suma=0+altura
media=suma/len(alturas)
#mostrar el media
print("La media es",media)

#Actividad 3
#pedir alçada
#crear una lista vacia de alturas y compañeros
comps=[]
alturas=[]
#pedir numero de compañeros
comp=int(input("Introduce compañeros:"))
#añadir en lista
comps.append(comp)
#sumar numero de compañeros
sumacomps=float(0+comp)
print("Hay",sumacomps,"compañeros.")
#pedir alturas
for i in range(comp):
    print("Introduzca altura", i+1, ":", sep="")
    altura=float(input())
    #añadir altura en lista
    alturas.append(altura)
    #mostrar alturas
    print(alturas)
#sumar y hacer media
suma=0+altura
media=suma/len(alturas)
#mostrar el media
print("La media es",media)
