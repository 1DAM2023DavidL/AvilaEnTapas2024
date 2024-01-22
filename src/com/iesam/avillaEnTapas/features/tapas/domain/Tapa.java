package com.iesam.avillaEnTapas.features.tapas.domain;

public class Tapa {
    private String id;
    private String nombre;
    private String establecimiento;
    private String totalDePuntos;
    private String mediaVotos;
    private String numeroParticipantes;
    private String totalVotos;
    private String ingredientes;
    private String urlImagen;

    public Tapa (String id, String nombre, String establecimiento, String totalDePuntos, String mediaVotos, String numeroParticipantes, String totalVotos, String ingredientes, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.establecimiento = establecimiento;
        this.totalDePuntos = totalDePuntos;
        this.mediaVotos = mediaVotos;
        this.numeroParticipantes = numeroParticipantes;
        this.totalVotos = totalVotos;
        this.ingredientes = ingredientes;
        this.urlImagen = urlImagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getTotalDePuntos() {
        return totalDePuntos;
    }

    public void setTotalDePuntos(String totalDePuntos) {
        this.totalDePuntos = totalDePuntos;
    }

    public String getMediaVotos() {
        return mediaVotos;
    }

    public void setMediaVotos(String mediaVotos) {
        this.mediaVotos = mediaVotos;
    }

    public String getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(String numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}