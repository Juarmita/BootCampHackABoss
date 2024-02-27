/*
    Ejercicio 2
    -----------
    Crear una clase llamada Vestimenta con los atributos: código, nombre, 
    precio, marca, talla y color (con sus métodos y constructores correspondientes).

    a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

        Zapato: material, tipoCierre

        Pantalon: estilo, tipoTejido

        Camiseta: manga, cuello

        Sombrero: tipo, tamaño

    b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta 
        y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero 
        (crear un objeto con parámetros para cada uno de ellos).

    c) Crear los siguientes métodos (en cada subclase correspondiente):

        Zapato: método para mostrar un mensaje en pantalla que diga "Estos 
        zapatos son de marca: " (mostrar marca).

        Pantalon: método para mostrar un mensaje en pantalla que diga   
        "Estos pantalones son de marca: " (mostrar estilo).

        Camiseta: método para mostrar un mensaje en pantalla que diga   
        "Esta camiseta es de marca: " (mostrar manga).

        Sombrero: método para mostrar un mensaje en pantalla que diga 
        "Este sombrero es de marca: " (mostrar tipo).

    d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

    PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente 
    cambia el mensaje que muestran. Tener en cuenta para esto la implementación 
    de herencia y sobrescritura de métodos.
 */
package ejercicion2_herenciapolimorfismo;

public class Main {

    public static void main(String[] args) {
        
        // Creamos el vector Vestimenta
        Vestimenta[] prenda = new Vestimenta[9];
        
        prenda[0] = new Zapato("Cuero", "Cordones", 145, "Castellanos", 149.99, "Pikolinos", "43", "Marron");
        prenda[1] = new Zapato("Polipiel", "Cremallera", 60, "Deportivas Classic", 49.99, "Adidas", "39", "Blanco");
        prenda[2] = new Zapato("Ante", "Elastico", 40, "Tipo vestir", 250.00, "Camper", "40", "Beige");
        prenda[3] = new Pantalon("Chinos", "Algodon", 14, "Chinos", 39.99, "Pedro del Hierro", "M", "Beige");
        prenda[4] = new Pantalon("Vaqueros", "Algodon", 13, "Vaquero", 29.99, "Diesel", "XL", "Azul");
        prenda[5] = new Pantalon("Recto", "Sintetico", 12, "Recto", 19.99, "Bershka", "S", "Negro");
        prenda[6] = new Camiseta("Corta", "Redondo", 1, "Basica", 12.45, "Element", "M", "Gris");
        prenda[7] = new Camiseta("Larga", "Picp", 2, "Vestir", 20.45, "Cortefiel", "L", "Celeste");
        prenda[8] = new Sombrero("Ala", "Grande", 100, "Sombrero ala", 45.00, "Cordoba", "M", "Crema");
        
        
        //Recorremos el vector
        
        for (Vestimenta elemento : prenda) {
            elemento.mensaje();
        }
    }
    
}
