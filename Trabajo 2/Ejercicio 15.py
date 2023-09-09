PESOA = int(input())
PESOB = int(input())
PESOC = int(input())
PESOD = int(input())
if (PESOA == PESOB) and (PESOA == PESOC):
    if PESOD > PESOA:
        print("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO")
    else:
        print("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO")
elif (PESOA == PESOB) and (PESOA == PESOD):
    print("LA ESFERA C ES LA DIFERENTE")
    if PESOC > PESOA:
        print("Y ES DE MAYOR PESO")
    else:
        print("Y ES DE MENOR PESO")
elif (PESOA == PESOC) and (PESOA == PESOD):
    print("LA ESFERA B ES LA DIFERENTE")
    if PESOB > PESOD:
        print("Y ES DE MAYOR PESO")
    else:
        print("Y ES DE MENOR PESO")
else:
    print("LA ESFERA A ES LA DIFERENTE")
    if PESOA > PESOB:
        print("Y ES DE MAYOR PESO")
    else:
        print("Y ES DE MENOR PESO")