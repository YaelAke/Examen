/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Yael
 */
public class TablaPeriodica {

    private int id;
    private String masaAtomica;
    private String numeroAtomico;
    private String simboloQuimico;
    private String nombre;
    private String color;
    
    public TablaPeriodica() {

    }

    public TablaPeriodica(int id, String masaAtomica, String numeroAtomico, String simboloQuimico, String nombre, String color) {
        this.id = id;
        this.masaAtomica = masaAtomica;
        this.numeroAtomico = numeroAtomico;
        this.simboloQuimico = simboloQuimico;
        this.nombre = nombre;
        this.color = color;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(String masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    public String getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(String numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getSimboloQuimico() {
        return simboloQuimico;
    }

    public void setSimboloQuimico(String simboloQuimico) {
        this.simboloQuimico = simboloQuimico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
