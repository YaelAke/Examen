<h1>SE CREA EL MODELO DE LA CLASE ESTADO</h1>
Se crea un objeto para almacenar el catalago de estado y municipio, se añade el constructor vacio al igual que con todos los atributos, junto con sus getters y setters, asi como el metodo ToString()<br>

```
package models;

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

        return "Catalago{" + "id=" + id + ", estado=" + nombreEstado + "municipio" + nombreMunicipio + '}';

    }
}
```

