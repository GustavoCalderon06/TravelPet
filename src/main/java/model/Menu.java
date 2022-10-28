package model;

import Interface.Ingresar;

public class Menu {
    public void principalMenu(){
        Bus bus = new Bus();
        boolean salir = false;
        int opcionPrincipal;
        imprimirConsejo();
        do {
            imprimirMenu();
            opcionPrincipal = Ingresar.ingresarInt();
            switch (opcionPrincipal) {
                case 1:
                    System.out.println("Ingrese el valor del pasaje");
                    int valorPasaje = Ingresar.ingresarInt();
                    bus.setValorPasaje(valorPasaje);
                    System.out.println("Valor del pasaje actualizado");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Ingrese numero del asiento:");
                    int numeroAsiento=Ingresar.ingresarInt();
                    while (numeroAsiento>40 || numeroAsiento<1){
                        System.out.println("Ingrese un numero valido");
                        numeroAsiento=Ingresar.ingresarInt();
                    }
                    System.out.println("Ingrese nombre del pasajero");
                    String nombrePasajero = Ingresar.ingresarString();
                    System.out.println("Tiene descuento? [1] Si , [2] No"); //System.out.println("Es Mascota?");
                    int tieneDescuento = Ingresar.ingresarInt();
                    //Transformar entero a boolean
                    boolean conDescueto = false;
                    if(tieneDescuento == 1) conDescueto= true;
                    Pasajero p = new Pasajero(nombrePasajero,conDescueto);
                    System.out.println(bus.agregarPasajeros(p,numeroAsiento));
                    System.out.println();
                    break;

                case 3:
                    System.out.println(bus.calcularGanancia());
                    System.out.println();
                    break;

                case 4:
                    System.out.println(bus.verDisponibilidad());
                    System.out.println();
                    break;

                case 5:
                    System.out.println(bus.getListadoPasajeros());
                    System.out.println();
                    break;

                case 0:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo números entre 0 y 5");
            }
        }
        while (!salir);
    }
    public static void imprimirMenu(){
        System.out.println("[1] Establecer valor del pasaje");
        System.out.println("[2] Agregar pasajeros");
        System.out.println("[3] Ganancia");
        System.out.println("[4] Ver Disponibilidad");
        System.out.println("[5] Ver lista de pasajeros");
        System.out.println("[0] Salir");
    }
    public static void imprimirConsejo(){
        System.out.println("Ingrese el numero de la opcion de desee");
        System.out.println("NOTA: RECUERDE INGRESAR EL VALOR DEL PASAJE PRIMERO");
    }


}
