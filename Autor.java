package Relacion10;

public class Autor {
    //Atributos
    String nombre;
    String nacionalidad;
    private static Autor autores[] = new Autor[10];
    static int numAutores;

        //Constructor
        public Autor(String nom, String nac){
            nombre = nom;
            nacionalidad = nac;
        }
    
        //ToString
        @Override
        public String toString() {
            return " Nombre: " + nombre + " Nacionalidad: " + nacionalidad;
        }

    //get
    public String getNombre() {
        return nombre;
    }
    //Mostrar datos
    public static void listarAutor(){
        for (int i = 0; i< numAutores; i++){
            System.out.println(autores[i].toString());
        }
    }

    //Almacenar en un array
    static boolean almacenarAutor (Autor a){
        if (numAutores<autores.length){
            autores[numAutores] = a;
            numAutores ++;
            return true;
        } else {
            return false;
        }
    }
}
