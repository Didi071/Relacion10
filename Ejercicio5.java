package Relacion10;
public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear autores
        Autor a1 = new Autor("Jane Austen", "Inglés");
        Autor a2 = new Autor("Sarah J.Maas", "Estadounidense");
        Autor a3 = new Autor("V. E. Schwab", "Estadounidense"); 

        // Almacenar autores
        System.out.println(Autor.almacenarAutor(a1));
        System.out.println(Autor.almacenarAutor(a2));
        System.out.println(Autor.almacenarAutor(a3)); 
        
        // Listar autores almacenados
        System.out.println("Autores almacenados:");
        Autor.listarAutor();

        // Crear libros
        Libro l1 = new Libro("100A", "Orgullo y Prejuicio", a1);
        Libro l2 = new Libro("110A", "Emma", a1);
        Libro l3 = new Libro("210A", "Ciudad Medialuna", a2);
        Libro l4 = new Libro("220A", "Una corte de rosas y espinas", a2);
        Libro l5 = new Libro("230A", "La vida invisible de Addie LaRue", a3);

        // Almacenar libros
        System.out.println(Libro.almacenarLibro(l1));
        System.out.println(Libro.almacenarLibro(l2));
        System.out.println(Libro.almacenarLibro(l3));
        System.out.println(Libro.almacenarLibro(l4));
        System.out.println(Libro.almacenarLibro(l5));

        // Listar libros almacenados
        System.out.println("Libros almacenados:");
        Libro.listarLibros();
    }
}