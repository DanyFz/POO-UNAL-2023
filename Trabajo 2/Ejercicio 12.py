#Ejercicio Resuelto 12
NOM = input("Ingrese el nombre del trabajador: ")
NHT = int(input("Ingrese el número de horas trabajadas en la semana: "))
VHN = int(input("Ingrese el valor de una hora normal de trabajo: "))

if NHT > 40:
    HET = NHT - 40
    if HET > 8:
        HEE8 = HET - 8
        SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN
    else:
        SALARIO = 40 * VHN + HET * 2 * VHN
else:
    SALARIO = NHT * VHN

print("EL TRABAJADOR", NOM, "DEVENGO: $", SALARIO)