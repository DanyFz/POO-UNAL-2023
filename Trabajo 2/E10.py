NI = int(input("Número de inscripción: "))
NOM = input("Nombres: ")
PAT = float(input("Patrimonio: "))
EST = int(input("Estrato social: "))

VALOR_MATRICULA = 50000

PAGMAT = VALOR_MATRICULA

if PAT > 2000000 and EST > 3:
    incremento = 0.03 * PAT  
    PAGMAT += incremento

#print("\nNúmero de inscripción:", NI)
#print("Nombres:", NOM)
#print("Pago de matrícula:", PAGMAT)

print("El estudiante", NOM, "con numero de inscripcion", NI, "debe pagar: $", PAGMAT)