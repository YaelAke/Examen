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
 
 ![](https://github.com/YaelAke/Imagenes/blob/2f014389ee18530066bc4ded0027a9082a29a82d/Captura%20de%20pantalla%202023-04-30%20055039.png)
 
 <h1>ESTABLECERER LOS DATOS DE LA TABLA </h1>
 Se define un método llamado setDatos() que se encarga de establecer los datos de una tabla con nuestra informacion de estados y municipios. Primero, se establece el  número de filas de la tabla en cero para poder borrar cualquier información anterior. Luego, se itera a través de cada objeto Estado en la lista catalago y se establece los  valores de la columna en un arreglo de objetos. Después, se agrega cada fila a la tabla mediante el método addRow(). Finalmente, estblecemos el modelo de datos de la tabla con dtmCatalago.
 
 ```
     private void setDatos() {
        Object[] datos = new Object[dtmCatalago.getColumnCount()];
        int i = 0;
        dtmCatalago.setRowCount(0);
        for (Estado estado : catalago) {
            datos[0] = i;
            datos[1] = estado.getId();
            datos[2] = estado.getNombreEstado();
            datos[3] = estado.getNombreMunicipio();
            i++;
            dtmCatalago.addRow(datos);
        }
        tblCatalago.setModel(dtmCatalago);
    }
 ```
 
  <h1>FUNCIONALIDAD A NUESTROS BOTONES</h1>
  Empezaremos con el boton de "Actualizar" donde empezaremos añadiendole un evento de mouseClicket donde le asignaremos una función que se encargara de actualizar los campos de texto en nuestro jTabel según la fila que este seleccionada donde con un "if" si el botón de "actualización" está seleccionado y se ha seleccionado una fila en la tabla, se actualizan los campos de texto con los valores de las celdas de la fila seleccionada. Si no se ha seleccionado ninguna fila, se muestra un mensaje de error en la consola y se desactiva el botón de "actualización". Si el botón de "actualización" no está seleccionado, se llamará a una función para limpiar los campos de texto en la interfaz de usuario.

```
    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {                                           
        int filaActual = tblCatalago.getSelectedRow();
        System.out.println(filaActual);
        if (btnActualizar.isSelected()) {
            if (filaActual != -1) {
                System.out.println(dtmCatalago.getValueAt(filaActual, 0));
                System.out.println(dtmCatalago.getValueAt(filaActual, 1));
                System.out.println(dtmCatalago.getValueAt(filaActual, 2));
                System.out.println(dtmCatalago.getValueAt(filaActual, 3));

                this.txtRecNo.setText("" + dtmCatalago.getValueAt(filaActual, 0));
                this.txtId.setText("" + dtmCatalago.getValueAt(filaActual, 1));
                this.txtEstado.setText("" + dtmCatalago.getValueAt(filaActual, 2));
                this.txtMunicipio.setText("" + dtmCatalago.getValueAt(filaActual, 3));
            } else {
                System.out.println("Debe seleccionar un registro..");
                this.btnActualizar.setSelected(false);
            }
        } else{
            limpiarCampos();  
        }
    }     
    
```

Continuando con el boton "Eliminar" donde igual con un mouseClicket le asignaremos una función que se encarga de eliminar una fila seleccionada de nuestro Jtabel donde igual con un condicional "if", si se ha seleccionado una fila en la tabla, se elimina esa fila de la tabla y se actualizan los datos de la tabla mediante la llamada al método "setDatos()". Finalmente, se imprime en la consola el contenido actualizado de la tabla de catálogo.

```
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         

        int filaActual = tblCatalago.getSelectedRow();
        System.out.println(filaActual);
        if(filaActual != -1){
        //dtmMunicipios.removeRow(filaActual);
        System.out.println(catalago);
        Estado.eliminar(filaActual);
        setDatos();
        System.out.println(catalago);
        }
    }  
````

El boton "Limpiar" unicamente  llama al metodo limpiarDatos() donde con un setText le mandamos un mensaje vacio a todos los jTextFiel que tenemos en nuestro frame

```
    private void limpiarCampos() {
        this.txtId.setText("");
        this.txtNombre.setText("");
        this.txtNumero.setText("-1");
    }
     private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        limpiarCampos();
    }   
```
Por ultimo nuestro boton "Aceptar" con un evento de mouseClicket que sirve para agregar o actualizar. por medio de un "if" validamos si el valor de recNo es -1, se agrega un nuevo estado con los valores de id, nombreEstado y nombreMunicipio proporcionados en los campos de texto. Si el valor de recNo es distinto a -1, se actualizan los datos del estado correspondiente a recNo con los valores de id, nombreEstado y nombreMunicipio proporcionados en los campos de texto. Se llama al método "setDatos()" para actualizar la tabla con los nuevos datos y al método "limpiarCampos()" para limpiar los campos de texto de los jTextField


```
    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        int id = Integer.parseInt(this.txtId.getText().trim());
        int recNo = Integer.parseInt(this.txtRecNo.getText().trim());
        String nombreEstado = this.txtEstado.getText();
        String nombreMunicipio = this.txtMunicipio.getText();

        if (recNo == -1) {
            Estado.añadir(id, nombreEstado,nombreMunicipio);
        } else {
            System.out.println("Actualizando datos...");
            Estado.actualizar(recNo, id, nombreEstado,nombreMunicipio);
            this.btnActualizar.setSelected(false);
            System.out.println(catalago);
        }
        setDatos();
        limpiarCampos(); 
        
    }  
```
  <h1>RESULTADOS</h1>
  Se puede observar como se inserta un nuevo estado y municipio junto con su id
  
  ![](https://github.com/YaelAke/Imagenes/blob/fc40ebaf167cfc28f14f42c527afc5ad91b44a26/Captura%20de%20pantalla%202023-04-30%20211717.png)
  
  ![](https://github.com/YaelAke/Imagenes/blob/fc40ebaf167cfc28f14f42c527afc5ad91b44a26/Captura%20de%20pantalla%202023-04-30%20211735.png)
  
  Se pude observar como se eliminar en un municipio al seleccionarlo y darle eliminar
  
  ![](https://github.com/YaelAke/Imagenes/blob/30578bb417ee4ff2dc3cd65b4b34d8b41915f8ab/Captura%20de%20pantalla%202023-04-30%20211954.png)
  
  ![](https://github.com/YaelAke/Imagenes/blob/30578bb417ee4ff2dc3cd65b4b34d8b41915f8ab/Captura%20de%20pantalla%202023-04-30%20212023.png)
  
  Tambien podemos ver que al seleccionar y darle a "actualizar" se nos llenan los campos con la informacion para poder actualizarla, luego al darle aceptar aparece en la columna con los datos actualizados
  
  ![](https://github.com/YaelAke/Imagenes/blob/9375f5d118ec7fd0232f3836826203ce030995f1/Captura%20de%20pantalla%202023-04-30%20212340.png)
  
  ![](https://github.com/YaelAke/Imagenes/blob/9375f5d118ec7fd0232f3836826203ce030995f1/Captura%20de%20pantalla%202023-04-30%20212355.png)
  
  ![](https://github.com/YaelAke/Imagenes/blob/9375f5d118ec7fd0232f3836826203ce030995f1/Captura%20de%20pantalla%202023-04-30%20212411.png)
  
  ![](https://github.com/YaelAke/Imagenes/blob/9375f5d118ec7fd0232f3836826203ce030995f1/Captura%20de%20pantalla%202023-04-30%20212428.png)
  
  Al seleccionar el boton "Limpiar" podemos observar que los datos que se encontraban en nuestros jTextField quedan vacios
  
  ![](https://github.com/YaelAke/Imagenes/blob/e2bee485ba5b67406f015f7b74c2511aa4b2f1fa/Captura%20de%20pantalla%202023-04-30%20212832.png)
    
  ![](https://github.com/YaelAke/Imagenes/blob/e2bee485ba5b67406f015f7b74c2511aa4b2f1fa/Captura%20de%20pantalla%202023-04-30%20212846.png)
  
  En nuestro centro de comandos podemos tener de lectura como cambia cuando insertamos, eliminamos o actualizamos alguno de nuestros datos
  
     
  ![](https://github.com/YaelAke/Imagenes/blob/58f4db25980cbc1db4b899aad91ae5f39cbce0a3/Captura%20de%20pantalla%202023-04-30%20080112.png)
  
  
  
  
