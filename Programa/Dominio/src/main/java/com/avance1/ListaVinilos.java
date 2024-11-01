package com.avance1;

import java.util.ArrayList;

public class ListaVinilos {
    private ArrayList<Vinilo> listaVinilos;


    public ListaVinilos(ArrayList<Vinilo> coleccion) {
        this.listaVinilos = coleccion;
    }

    public void agregarVinilo(Vinilo vinilo) {
        if (this.listaVinilos.size() < 100) {
            this.listaVinilos.add(vinilo);
        } else {
            Mensaje.mostrarMensaje("Coleccion llena!");
        }
    }

    public void verCantidadVinilos() {
        System.out.println(this.listaVinilos.size());
    }

    public void verEspaciosDisponibles() {
        System.out.println(100 - this.listaVinilos.size());
    }

    public boolean buscarVinilo(String nombre) { /* busca el vinilo por el nombre del disco */
        boolean estado = false;
        for (int i = 0; i < this.listaVinilos.size(); i++) {
            if (listaVinilos.get(i).getNombreDisco().equals(nombre)) {
                estado = true;
                break;
            }

        }
        return estado;

    }


    }


