/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

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

    @Override

    public String toString() {

        return "Elementos{" + "id=" + id + ", Masa Atomica=" + masaAtomica + ", Numero Atomico=" + numeroAtomico + ", Simbolo atomico=" + simboloQuimico + ", Nombre=" + nombre + ", Color=" + color + '}';

    }

    public static ArrayList<TablaPeriodica> tabla = new ArrayList<>();

    public static void lista() {
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println(tabla.get(i).toString());
        }
    }

    public static void llenar() {
        tabla.add(new TablaPeriodica(1, "20.18", "10", "Ne", "Neon", "Rosado"));
        tabla.add(new TablaPeriodica(2, "40.08", "20", "Ca", "Calcio", "Beige"));
        tabla.add(new TablaPeriodica(3, "65.41", "30", "Zn", "Cinc", "Beige"));
        System.out.println(tabla);
    }

    public static void añadir(int id, String masaAtomica, String numeroAtomico, String simboloQuimico, String nombre, String color) {
        tabla.add(new TablaPeriodica(id, masaAtomica, numeroAtomico, simboloQuimico, nombre, color));
        System.out.println(tabla);
    }

    public static void actualizar(int recNo, int id, String masaAtomica, String numeroAtomico, String simboloQuimico, String nombre, String color) {
        tabla.get(recNo).setId(id);
        tabla.get(recNo).setMasaAtomica(masaAtomica);
        tabla.get(recNo).setNumeroAtomico(numeroAtomico);
        tabla.get(recNo).setSimboloQuimico(simboloQuimico);
        tabla.get(recNo).setNombre(nombre);
        tabla.get(recNo).setColor(color);

    }

    public static void eliminar(int id) {
        tabla.remove(id);
    }

 
    

}
