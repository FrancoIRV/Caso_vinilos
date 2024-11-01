package com.avance1;

import java.util.Scanner;

public class Menu {
    public static void mostrarOpciones(){
        System.out.println("1. Agregar vinilo");
        System.out.println("2. Ver cantidad de vinilos");
        System.out.println("3. Ver espacio disponible");
        System.out.println("4. Buscar vinilo");
        System.out.println("5. Salir");
    }

    public static  String pedirString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Vinilo pedirDatosVinilo(){/* pide los datos y crea un objeto vinilo */
        String nombreDisco = pedirString();
        String nombreArtista = pedirString();
        String añoLanzamiento = pedirString();
        return new Vinilo(nombreDisco, nombreArtista, añoLanzamiento);
        }


    public static void ejecutarOpcion(ListaVinilos coleccion){
        boolean continuar = true;
        do{
            mostrarOpciones();
            Mensaje.mostrarMensaje("Ingresa una opcion");
            String opcion = pedirString();
            switch(opcion){
                case "1":
                    Mensaje.mostrarMensaje("Ingresa los datos del vinilo, nombre-artista-fecha");
                    coleccion.agregarVinilo(pedirDatosVinilo());
                    break;
                case "2":
                    Mensaje.mostrarMensaje("Tu cantidad de vinilos es:");
                    coleccion.verCantidadVinilos();
                    break;
                case "3":
                    Mensaje.mostrarMensaje("Los espacios disponibles son:");
                    coleccion.verEspaciosDisponibles();
                    break;
                case "4":

                    Mensaje.mostrarMensaje("Ingresa el nombre del disco");
                    String nombreABuscar = pedirString();
                    if(coleccion.buscarVinilo(nombreABuscar)){
                        Mensaje.mostrarMensaje("Vinilo encontrado");
                    }
                    else{
                        Mensaje.mostrarMensaje("Vinilo no encontrado");
                    }
                    break;

                case "5":
                    Mensaje.mostrarMensaje("Adios!");
                    continuar = false;
                    break;
                default:
                    Mensaje.mostrarMensaje("Opcion invalida");

            }

        } while(continuar);
    }

}
