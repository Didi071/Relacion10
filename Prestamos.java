package Relacion10;

public class Prestamos {
    //Atributos
    String fechaPrest;
    String fechaDev;
    String libroPres;
    String cliente;
    private static Prestamos prestamos[] = new Prestamos[10];
    static int totalPrest=0;

    //Constructor
    public Prestamos(String fp, String fd, String l, String cl){
        fechaDev = fd;
        fechaPrest = fp;
        libroPres = l;
        cliente =cl;
    }

    //To String
    @Override
    public String toString() {
        return "El prestamo se realizó el " + fechaPrest + " por el cliente " +cliente + " del libro " + libroPres + " con fecha de devolucion " + fechaDev;
    }

        //Mostrar datos
        public static void listarPrestamos(){
            for (int i = 0; i< totalPrest; i++){
                System.out.println(prestamos[i].toString());
            }
        }
    
        //Almacenar en un array
        static boolean almacenarPrestamos (Prestamos p){
            if (totalPrest<prestamos.length){
                prestamos[totalPrest] = p;
                totalPrest ++;
                return true;
            } else {
                return false;
            }
        }
}
