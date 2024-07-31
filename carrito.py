class Carrito():
    puerta_cerrada=True
    aire_encendido=False
    def __init__(self,puertas:int,color:str,marca:str,pasajeros_max:int,tamaño,tiene_aire:bool):
        self.puertas=puertas
        self.color=color
        self.marca=marca
        self.pasajeros_max=pasajeros_max
        self.tamaño=tamaño
        self.tiene_aire=tiene_aire
    
    def avanzar(self):
        print("Run Run Ñeeeen")

    def pito(self):
         print("PIPIPI")

    def puerta(self):
        if self.puerta_cerrada==True:
            self.puerta_cerrada=False
            print("Se abrió la puerta")
        else:
            self.puerta_cerrada=True
            print("Se cerró la puerta")

    def aire(self):
        if self.tiene_aire:
            if self.aire_encendido==True:
                self.aire_encendido=False
                print("Se apagó el aire acondicionado")
            else:
                self.aire_encendido=True
                print("Se encendió el aire acondicionado")
        else:
             print("El carro no tiene aire acondicionado")

    def cambiar_marcha(self):
        print("Cambiando marcha...")

    def freno(self):
        print("El carro se detuvó")

    def opciones_carro(self):
        opcion=int(input("\n1-Avanzar.\n2-Frenar.\n3-Puerta.\n4-Aire acondicionado.\n5-Cambiar marcha\n6-Pito\n"))
        if opcion==1:
                self.avanzar()
        elif opcion==2:
                self.freno()
        elif opcion==3:
                self.puerta()
        elif opcion==4:
                self.aire()
        elif opcion==5:
                self.cambiar_marcha()
        elif opcion==6:
             self.pito()

toyota=Carrito(4,"verde","Toyota",5,"Grande",True)
suzuki=Carrito(2,"Azul","Suzuki",4,"Mediano",False)

carro_seleccionado=int(input("Usted tiene dos carros. Escoja un carro\n1-Toyota grande con aire acondicionado\n2-Suzuki mediano sin aire acondicionado\n"))
if carro_seleccionado==1 or carro_seleccionado==2:
    while True:
        if carro_seleccionado==1:
             toyota.opciones_carro()
        if carro_seleccionado==2:
             suzuki.opciones_carro()