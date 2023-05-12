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





