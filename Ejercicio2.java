public class Ejercicio2 {
    // Pedir las tres notas
try:
    n1 = float(input("Ingrese la nota 1: "))
    n2 = float(input("Ingrese la nota 2: "))
    n3 = float(input("Ingrese la nota 3: "))

    // Validar que estén en el rango [0.0, 5.0]
    if not (0.0 <= n1 <= 5.0 and 0.0 <= n2 <= 5.0 and 0.0 <= n3 <= 5.0):
        print("Nota invalida")
    else:
        // Calcular el promedio
        promedio = round((n1 + n2 + n3) / 3, 2)
        print("Promedio:", promedio)

        //Clasificar según el promedio
        if promedio >= 4.5:
            print("Promocionado")
        elif promedio >= 4.0:
            print("Regular")
        else:
            print("Reprobado")

except ValueError:
    print("Nota invalida")
    
    


    
    

    

    
}
