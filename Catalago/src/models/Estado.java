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
public class Estado {

    private int id;
    private String nombreEstado;
    private String nombreMunicipio;

    public Estado() {
    }

    public Estado(int id, String nombreEstado, String nombreMunicipio) {
        this.id = id;
        this.nombreEstado = nombreEstado;
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    @Override

    public String toString() {

        return "Catalago{" + "id=" + id + ", estado=" + nombreEstado + " ,municipio=" + nombreMunicipio + '}';

    }
    public static ArrayList<Estado> catalago = new ArrayList<>();

    public static void lista() {

        for (int i = 0; i < catalago.size(); i++) {
            System.out.println(catalago.get(i).toString());
        }
    }
    
    public static void llenar() {
        catalago.add(new Estado(1, "Campeche","Champoton"));
        catalago.add(new Estado(2, "Campeche","Carmen"));
        catalago.add(new Estado(3, "Campeche","Escarcega"));
        catalago.add(new Estado(4, "Campeche","Calkini"));
        catalago.add(new Estado(5, "Campeche","Hecelchakan"));
        catalago.add(new Estado(6, "Campeche","Seybaplaya"));
        System.out.println(catalago);

    }

    public static void añadir(int id, String nombreEstado, String nombreMunicipio) {
        catalago.add(new Estado(id, nombreEstado, nombreMunicipio));
        System.out.println(catalago);
    }

    public static void actualizar(int recNo, int id, String nombreEstado, String nombreMunicipio) {
        catalago.get(recNo).setId(id);
        catalago.get(recNo).setNombreEstado(nombreEstado);
        catalago.get(recNo).setNombreMunicipio(nombreMunicipio);

    }

    public static void eliminar(int id) {
        catalago.remove(id);
    }

}
