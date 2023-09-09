N1 = int(input("Ingrese el primer número: "))
N2 = int(input("Ingrese el segundo número: "))
N3 = int(input("Ingrese el tercer número: "))

MAYOR = N1

if N2 > MAYOR:
    MAYOR = N2

if N3 > MAYOR:
    MAYOR = N3
1
print("El valor mayor entre", N1, ",", N2, "y", N3, "es:", MAYOR)
