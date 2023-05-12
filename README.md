# SE CREA EL MODELO DE LA CLASE PRINCIPAL
Creamos un jFrame donde posteriormente añadiremos un jTextArea llamado jsonEntrada que sera el encargado de mostrar el contenido de nuestro archivo json, posteriormente se añade un jTextField con el nombre de "Archivo" que servira para mostrar la ruta y el nombre del archivo json que seleccionamos, finalmente añadimos tres botones, un boton llamado "archivo" cuya funcion sera buscar el archivo, otro boton llamado "guardar" que guardara nuestras ediciones en nuestro jTextArea y finalemnte añadimos un boton "eliminar" que se encargara de eliminar el archivo seleccionado.

![](https://github.com/YaelAke/Imagenes/blob/e9bb36a66cbc21ef792e05f2b18ebae953d9d5c0/Captura%20de%20pantalla%202023-05-11%20223416.png)

# FUNCIONALIDAD AL BOTON "ARCHIVO"
Empezamos añadiendole un evento a nuestro boton con un mouseClicket, luego en el evento creamos una instancia de la clase JFileChoser cuya funcion es seleccionar el archivo, posteriormente creamos un filtro de la extension para mostrar solamente los archivos "json" y se lo establecemos al JFileChoser, luego mostramos el cuadro para que el usuario seleccione el archivo, con el metodo "showOpenDialog(this)" bloqueamos la ejecucion hasta que el usuario seleccione el archivo o decida cancelarlo<br>
Si el usuario selecciona un archivo y da clic en "Aceptar" en el apartado de selección, se obtiene el archivo seleccionado utilizando el método getSelectedFile() y se establece el texto del componente "jsonArchivo" con la ruta absoluta del archivo seleccionado para intentar leer el contenido del archivo seleccionado utilizando un FileReader ya que el FileReader se encarga de leer el archivo en formato de texto<br>
Creamos una cadena vacia para almacenar el archivo de texto y se lee el primer carácter del archivo utilizando el método "read()" del FileReader, si el valor devuelto es -1 va a significar que se ha alcanzado el final del archivo y se realiza un bucle mientras no se haya alcanzado el final del archivo en ccada iteraccion se concatena el carácter leído a nuestra cadena<br>
Finalmente se actualiza el texto de nuestro jTextArea llamado "jsonEntrada" con el contenido completo del archivo y si ocurre alguna excepción durante la lectura del archivo, entonces se imprime la excepción.

```
    private void btnArchivoMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        System.out.println("Inico de la carga de archivo");
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "json");
        fc.setFileFilter(filter);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.CANCEL_OPTION) {
        } else if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fc.getSelectedFile();
            this.jsonArchivo.setText(archivoSeleccionado.getAbsolutePath());
            try (FileReader fr = new FileReader(archivoSeleccionado)) {
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena += (char) valor;
                    valor = fr.read();
                }
                this.jsonEntrada.setText(cadena);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Archivo cargado correctamente");
        }
    } 
     
``` 

![](https://github.com/YaelAke/Imagenes/blob/07e442dcf114a2530c3be03718f905358937357f/Captura%20de%20pantalla%202023-05-11%20232715.png)

![](https://github.com/YaelAke/Imagenes/blob/07e442dcf114a2530c3be03718f905358937357f/Captura%20de%20pantalla%202023-05-11%20232729.png)

![](https://github.com/YaelAke/Imagenes/blob/07e442dcf114a2530c3be03718f905358937357f/Captura%20de%20pantalla%202023-05-11%20232741.png)

![](https://github.com/YaelAke/Imagenes/blob/07e442dcf114a2530c3be03718f905358937357f/Captura%20de%20pantalla%202023-05-11%20232757.png)

# FUNCIONALIDAD AL BOTON "GUARDAR"
Empezamos añadiendole un evento a nuestro boton con un mouseClicket, luego en el evento creamos un objeto de la clase "File" llamado archivo, utilizando la ruta en nuestro jTextArea "jsonEntrada", luego creamos un objeto de la clase PrintWriter llamado "escribir" para escribir en el archivo<br>
Se intentara escribir el contenido de nuestro jTextArea "jsonEntrada" en el archivo utilizando el método print de PrintWriter y se cierra el objeto escribir para asegurarse de que los datos se escriban correctamente en nuestro archivo<br>
Finalmenre si ocurre una excepción de tipo FileNotFoundException (archivo no encontrado) se captura la excepción y se registra un mensaje de error en nuestro comando

``` 
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        System.out.println("Inico guardar archivo");
        File archivo = new File(this.jsonArchivo.getText());
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(jsonEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println("Archivo guardado");
    }   

``` 

![](https://github.com/YaelAke/Imagenes/blob/ba5ea4b6f76a18911fb191e808c79ba6f0597e09/Captura%20de%20pantalla%202023-05-11%20234558.png)

![](https://github.com/YaelAke/Imagenes/blob/ba5ea4b6f76a18911fb191e808c79ba6f0597e09/Captura%20de%20pantalla%202023-05-11%20234623.png)

![](https://github.com/YaelAke/Imagenes/blob/ba5ea4b6f76a18911fb191e808c79ba6f0597e09/Captura%20de%20pantalla%202023-05-11%20234726.png)

# FUNCIONALIDAD AL BOTON "ElIMINAR"
Empezamos añadiendole un evento a nuestro boton con un mouseClicket, luego en el evento creamos un objeto de la clase "File", utilizando la ruta en nuestro jTextArea "jsonEntrada y la ruta del archivo a eliminar se obtiene a través del método getText() del jTextField "jsonArchivo"<br>
Se intenta eliminar el archivo utilizando el método delete() del objeto archivo. Este método devuelve true si el archivo se elimina exitosamente y false en caso contrario<br>
Si el archivo se elimina exitosamente entonces se imprime en la consola el mensaje "Archivo borrado" junto con el nombre del archivo eliminado que es obtenido a través del método getName() del objeto archivo y si ocurre algún error al intentar borrar el archivo, se imprime en la consola el mensaje "Error al borrar el archivo".

``` 
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        System.out.println("Inico eliminar archivo");
        File archivo = new File(this.jsonArchivo.getText());
        if (archivo.delete()) {
            System.out.println("Archivo borrado: " + archivo.getName());
        } else {
            System.out.println("Error al borrar el archivo");
        }
        jsonArchivo.setText("");
        jsonEntrada.setText("");
        JOptionPane.showMessageDialog(null,"ARCHIVO BORRADO EXITOSAMENTE");
    }     
 ```  
![](https://github.com/YaelAke/Imagenes/blob/140cf5be8e9d69746568e06688de66fc2fd7412f/Captura%20de%20pantalla%202023-05-12%20000624.png)
 
![](https://github.com/YaelAke/Imagenes/blob/140cf5be8e9d69746568e06688de66fc2fd7412f/Captura%20de%20pantalla%202023-05-12%20000650.png)
 
![](https://github.com/YaelAke/Imagenes/blob/140cf5be8e9d69746568e06688de66fc2fd7412f/Captura%20de%20pantalla%202023-05-12%20000857.png)



