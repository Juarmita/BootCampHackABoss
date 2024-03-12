
package ejercicion2_collections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double precioMayor = 0;
        ArrayList<Producto> producto = new ArrayList<>();
        
        Producto objeto = new Producto(1, "MackBook", "Apple", "Laptop", 500, 2500, 12);
        producto.add(objeto);
        Producto objeto1 = new Producto(2, "MiTv", "Xiaomi", "TV", 300, 599.99, 4);
        producto.add(objeto1);
        Producto objeto2 = new Producto(3, "Galaxy S24", "Samsung", "Celular", 800, 1300.75, 50);
        producto.add(objeto2);
        Producto objeto3 = new Producto(4, "Conga", "Cecotec", "Robot Aspirador", 150, 399, 25);
        producto.add(objeto3);
        Producto objeto4 = new Producto(5, "myCooking", "Thermomix", "Robot Cocina", 600, 1199.95, 8);
        producto.add(objeto4);
        Producto objeto5 = new Producto(6, "Beats Flex", "Beats", "Auriculares", 25, 75, 100);
        producto.add(objeto5);
        Producto objeto6 = new Producto(7, "MiPad", "Xiaomi", "Tablet", 100, 500, 19);
        producto.add(objeto6);
        Producto objeto7 = new Producto(8, "Iphone", "Apple", "Celular", 200, 1485, 35);
        producto.add(objeto7);
        Producto objeto8 = new Producto(9, "HP Pavilion", "HP", "Laptop", 489, 900, 2);
        producto.add(objeto8);
        Producto objeto9 = new Producto(10, "Asus ROG", "Asus", "Laptop", 784, 1465, 65);
        producto.add(objeto9);
        
        //Recorremos el array para ver el elemento de mayor coste
       for(int i = 0; i<producto.size();i++){
            
        }
       }
    }
    
