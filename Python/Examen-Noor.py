#Examen M14
#Crear llistas vacias para Numero de libros, nombre de autor, nombre de libro y precio

nombrelibros=[]
autors=[]
precios=[]
#pedimos numero de libros 
numlibro=int(input("Introduze el numero de libros"))

#varificamos si el valor introducido es entre 0 a 10 
while numlibro  <2 or numlibro >10:
    numlibro=int(input("Introduze el numero de libros otra vez"))

#pedimos titol, autoe y precio del libro
for i in range(numlibro):
    nombrelibro=input("Introduze el nombre de libro")
    nombrelibros.append(nombrelibro)
    autor=input("Autor del libro:")
    autors.append(autor)
    precio=float(input("Precio del libro:"))
    precios.append(precio)
    

print("Nombres de libros:",nombrelibros)   
print("Autors de libros:",autors)
print("precios de libros:",precios)

#ahora ponemos variables que no son listas 
#suponfgamos que posicion incial de caro y barato es 0
#supongamos que valor de posmax y posmin es 0
posmax=0
posmin=0
caro=precios[0]
barato=precios[0]
#calcular libro más caro y barato 
for i in range(len(nombrelibros)):
    if precios[i] > caro:
    	caro = precios[i]
    	posmax=i
    if precios[i] < barato:
    	barato = precios[i]
    	posmin=i

print("El libro más caro es",nombrelibros[posmax],"y vale",precios[posmax])
print("El libro más barato es",nombrelibros[posmin],"y vale",precios[posmin])