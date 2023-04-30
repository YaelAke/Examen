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
public class Municipio {

    private int id;
    private String nombre;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private String estado;

    public Municipio() {

    }

    public Municipio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Municipio{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public static ArrayList<Municipio> municipios = new ArrayList<>();

   public static void llenarMunicipios() {
        municipios.add(new Municipio(1, "Calkini"));
        municipios.add(new Municipio(2, "Campeche"));
        municipios.add(new Municipio(3, "Carmen"));
        municipios.add(new Municipio(4, "Hecelchakan"));
        municipios.add(new Municipio(5, "Champoton"));
        municipios.add(new Municipio(6, "Escarcega"));
        System.out.println(municipios);

    }

    public static void listMunicipiosForE() {
        System.out.println("FOR-E");
        for (Municipio municipio : municipios) {
            System.out.println(municipio);

        }
    }

    public static void listaMunicipiosForI() {
        System.out.println("FOR-I");
        for (int i = 0; i < municipios.size(); i++) {
            System.out.println(municipios.get(i).toString());
        }
    }

    public static void eliminarMunicipio(int id) {
        municipios.remove(id);
    }

    public static void añadirMunicipio(int id, String nombre) {
        municipios.add(new Municipio(id, nombre));
    }
    
    public static void actualizarMunicipio(int recNo, int id, String nombre){
        municipios.get(recNo).setId(id);
        municipios.get(recNo).setNombre(nombre);
    }

}
