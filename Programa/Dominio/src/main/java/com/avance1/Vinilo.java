package com.avance1;

public class Vinilo {
    private String nombreArtista;
    private String nombreDisco;
    private String añoLanzamiento;

    public Vinilo(String nombreDisco, String nombreArtista, String añoLanzamiento){
        this.nombreDisco = nombreDisco;
        this.nombreArtista= nombreArtista;
        this.añoLanzamiento = añoLanzamiento;

    }


    public String getNombreDisco(){
        return this.nombreDisco;
    }

}

