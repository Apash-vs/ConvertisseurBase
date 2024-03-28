def convertir_base(nombre, base_depart, base_arriver):
    nombre_decimal = int(nombre, base_depart)
    nombre_binaire = ""
    if base_arrivee == 2:
        nombre_converti = bin(nombre_decimal)
    elif base_arrivee == 10:
        nombre_converti = str(nombre_decimal)
    elif base_arrivee == 16:
        nombre_converti = hex(nombre_decimal)
    else:
        print("Base d'arrivée est incorrecte")
        return
    return nombre_converti

nombre = input("Entrez le nombre à convertir : ")
base_depart = int(input("Entrez la base de départ (2 pour binaire, 10 pour décimal, 16 pour hexadécimal) : "))
base_arrivee = int(input("Entrez la base d'arrivée (2 pour binaire, 10 pour décimal, 16 pour hexadécimal) : "))
nombre_converti = convertir_base(nombre, base_depart, base_arrivee)
print("Le nombre converti est :", nombre_converti)
