package Relacion10;

public class Libro {
    //Atributos
    String codigo;
    String titulo;
    Autor autor;
    private static Libro[] libros = new Libro[20];
    static int numLibros=0;

    //Constructor
    public Libro(String cod, String t, Autor autor){
        codigo = cod;
        titulo = t;
        this.autor=autor;
    }

    //ToString
    @Override
    public String toString() {
        return "Libro con código: " + codigo + " título: " + titulo + " y autor: "+ autor.getNombre();
    }

    //get nombre
    public String getTitulo() {
        return titulo;
    }
    //Mostrar datos
    public static void listarLibros(){
        for (int i = 0; i< numLibros; i++){
                System.out.println(libros[i].toString());
        }
    }

    //Almacenar en un array
    static boolean almacenarLibro (Libro l){
        if (numLibros<libros.length){
            libros[numLibros] = l;
            numLibros ++;
            return true;
        } else {
            return false;
        }
    }
}
