name= str(input('Ingrese su nombre: '))
s_h= float(input('Ingrese el salario por hora: '))
horas= int(input('Ingrese la cantidad de horas: '))
salario= s_h*horas
if salario<450000:    
    print(f'Nombre:{name}')
else:
    print(f'Nombre:{name}, salario: {salario}')        
    
