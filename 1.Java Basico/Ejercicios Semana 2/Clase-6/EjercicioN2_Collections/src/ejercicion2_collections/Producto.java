/*
    Ejercicio 2
    -----------
    Un administrador de una tienda de electrónica necesita un programa para 
    gestionar los productos en su inventario. Para ello, necesita la creación 
    de una clase Producto que cuente con los siguientes datos: código, nombre, 
    marca, tipo, precio costo, precio venta, cantidad en stock.

    A partir de esto, realizar las siguientes acciones en el programa desarrollado:

    a)Crear 10 objetos de tipo Producto con sus correspondientes valores cargados 
    (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

    b)Guardar estos objetos creados en un ArrayList.

    c)Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

    d)Recorrer el ArrayList y determinar el producto con el menor precio de costo.

    e)Borrar el producto que se encuentre en la posición 5 del ArrayList.

    f)Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.

    g)Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
*/
package ejercicion2_collections;

public class Producto {
    long codigo;
    String nombre;
    String marca;
    String tipo;
    double precioCosto;
    double precioVenta;
    int stock;

    public Producto() {
    }

    public Producto(long codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
 }
