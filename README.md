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
<h1>SE CREA UN ARRAYLIST DE OBJETOS DENTRO DE LA MISMA CLASE ESTADO</h1>

```
public class Estado {
    static ArrayList<Estado> catalogo = new ArrayList<>();
```
<h1>SE CREAN LOS METODOS DE AÑADIR, ACTUALIZAR Y ELIMINAR DENTRO DE LA MISMA CLASE ESTADO</h1>

```
    public static ArrayList<Estado> catalago = new ArrayList<>();

    public static void añadir(int id, String nombreEstado, String nombreMunicipio) {
        catalago.add(new Estado(id, nombreEstado, nombreMunicipio));
    }

    public static void actualizar(int recNo, int id, String nombreEstado, String nombreMunicipio) {
        catalago.get(recNo).setId(id);
        catalago.get(recNo).setNombreEstado(nombreEstado);
        catalago.get(recNo).setNombreMunicipio(nombreMunicipio);

    }

    public static void eliminar(int id) {
        catalago.remove(id);
    }
  ```
 
 <h1>SE CREA UN JFRAME Y SE AÑADE UN JTABEL</h1>
 Dentro del frame, crearemos un jTabel, asi como un boton para aceptar, limpiar, eliminar y actualizar(ToggleButton), y a su vez cuatro carteles acompañados de un jtextFiel.Tambien en nuestra clase Main llamada "Catalago" crearemos una instancia de la clase "Principal" para hacer visible el GUI en el centro de la pantalla.<br>
 
```
public class Catalago {

    public static Principal principal = new Principal();

    public static void main(String[] args) {
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
}
```
 
![](https://github.com/YaelAke/Imagenes/blob/f0d97841d3ee361b5f0c6ad89fc48b8abb47c248/Captura%20de%20pantalla%202023-04-30%20051217.png)

 <h1>LE ASIGNAREMOS UN MODELO A NUESTRO JTABEL</h1>
 Le añadiremos un modelo a nuestro jTabel que se define por un arreglo de cadenas para que tenga 4 colmunas conformadas cada una por "No","Id","Estado",y "Municipio"
 
 ```
     private void setModelo() {
        String[] tlbCabecera = {"No", "ID", "MUNICIPIOS", "ESTADOS"};
        dtmCatalago.setColumnIdentifiers(tlbCabecera);
        tblCatalago.setModel(dtmCatalago);
    }
 
 ```


