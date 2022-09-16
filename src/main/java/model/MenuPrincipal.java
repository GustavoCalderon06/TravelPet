package model;

import GUIs.loginPage;
import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal() {

        menu();
    }

    public void menu(){
        boolean salir = false;
        int opcionPrincipal;
        imprimirMensajeInicio();
        do {
            imprimirOpciones();
            opcionPrincipal = ingresar();

            switch (opcionPrincipal) {
                case 1:
                    imprimirUsuarios();
                    break;


                case 2:
                    loginPage login = new loginPage();

                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        }
        while (!salir);
    }
    public static void imprimirMensajeInicio(){
        System.out.println("Bienvenido a Travel Pet Enterprieses");
        System.out.println("Para esta prueba por consola debe:");
        System.out.println("Ingrese el numero de la opcion de desee");
    }
    public static void imprimirOpciones(){
        System.out.println("[1] Registrar");
        System.out.println("[2] Ingresar");
        System.out.println("[3] Salir");
    }
    public static void imprimirUsuarios(){
        System.out.println("En desarrollo, favor testear usuarios ya creados");
        System.out.println("user1,pass1");
        System.out.println("user2,pass2");
        System.out.println("user3,pass3");
        System.out.println("user4,pass4");
        System.out.println("user5,pass5");
        System.out.println("user6,pass6");
        System.out.println("user7,pass7");
    }

    public static int ingresar(){
        return new Scanner(System.in).nextInt();
    }



}


