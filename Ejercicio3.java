package Relacion10;
public class Ejercicio3 {
    public static void main(String[] args) {
        PruebaArticulo prueba = new PruebaArticulo(3);

        Articulo articulo1 = new Articulo(100, "Camiseta" );
        Articulo articulo2 = new Articulo(110, "Pantalón");
        Articulo articulo3 = new Articulo(120, "Zapatos");
        Articulo articulo4 = new Articulo(130, "Sombrero");

        System.out.println("¿Se almacenó el artículo 1? " + prueba.Almacena(articulo1)); // true
        System.out.println("¿Se almacenó el artículo 2? " + prueba.Almacena(articulo2)); // true
        System.out.println("¿Se almacenó el artículo 3? " + prueba.Almacena(articulo3)); // true
        System.out.println("¿Se almacenó el artículo 4? " + prueba.Almacena(articulo4)); // false, ya que el array está lleno
        System.out.println(prueba);
    }
}
