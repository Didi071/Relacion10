package Relacion10;

import java.util.Scanner;

public class Articulo {
    //Atributos
    private int codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int stock;
    static Articulo[] almacen = new Articulo[20];
    static int numArticulos=0;


    //Metodos constructor
    public Articulo (int cod, String desc, float prC, float prV, int stock){
        this.stock=stock;
        codigo=cod;
        descripcion=desc;
        precioCompra=prC;
        precioVenta=prV;
        numArticulos++;
    }
    //Metodos get
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public float getPrecioCompra() {
        return precioCompra;
    }
    public float getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Articulo con codigo= " + codigo + ", descripcion = " + descripcion +" precio de Venta " + precioVenta + " precio de Compra "+ precioCompra + " y un stock "+ stock; 
    }

    //a entrada automatizada. Creara 4 articulos de prueba
    static void entradaAutomatizada(){
        almacen[numArticulos]= new Articulo(200, "Monitor", 150.0f, 200.0f, 50);
        numArticulos++;
        almacen[numArticulos] = new Articulo(210, "Ratón", 10.0f, 15.0f, 100);
        numArticulos++;
        almacen[numArticulos] = new Articulo(220, "Teclado", 20.0f, 30.0f, 80);
        numArticulos++;
        almacen[numArticulos] = new Articulo(230, "Cargador", 5.0f, 8.0f, 200);
        numArticulos++;
    }
    //lista: Muestra todos los datos de los articulos del almacen
    static void lista(){
        for (int i=0; i<numArticulos; i++){
            if (almacen[i] != null) { 
                System.out.println(almacen[i].toString());
            }
    }}

    //alta: Crear un nuevo articulo en el almacen
    static void alta(int cod, String desc, float prC, float prV, int stock){
        if(numArticulos<almacen.length){
            almacen[numArticulos] = new Articulo(cod, desc, prC, prV, stock);
            numArticulos++;
        } else{
            System.out.println("No hay más espacio en el almacen");
        }
    }

    //baja: Dar de baja a un articulo del almacen
    static void baja(int pocision) {
                almacen[pocision] = null; 
                numArticulos--;
            }

    // Aumentar el stock de un artículo

    static void entradaMercancia(int cod, int cantidad) {
        for (int i = 0; i < numArticulos; i++) {
            if (almacen[i] != null) {
                if (almacen[i].getCodigo() == cod) {
                    almacen[i].setStock(almacen[i].getStock() + cantidad);
                    return;
                }
            }
        }
    }

    // Disminuir el stock de un artículo
    static void salidaMercancia(int cod, int cantidad) {
        for (int i = 0; i < numArticulos; i++) {
            if (almacen[i].getCodigo() == cod) {
                if (almacen[i].getStock() >= cantidad) {
                    almacen[i].stock -= cantidad;
                } else {
                    System.out.println("No hay suficiente stock.");
                }
                return;
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("0. Entrada automatizada");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Entrada de mercancía");
            System.out.println("5. Salida de mercancía");
            System.out.println("6. Salida");;
            opcion=entrada.nextInt();
            switch (opcion) {
                case 0:
                Articulo.entradaAutomatizada();
                    break;
                case 1:
                Articulo.lista();
                    break;
                case 2: 
                System.out.print("Ingrese el código del artículo: ");
                int cod = entrada.nextInt();
                entrada.nextLine(); // Para consumir el salto de línea
                System.out.print("Ingrese la descripción: ");
                String desc = entrada.nextLine();
                System.out.print("Ingrese el precio de compra: ");
                float prC = entrada.nextFloat();
                System.out.print("Ingrese el precio de venta: ");
                float prV = entrada.nextFloat();
                System.out.print("Ingrese el stock: ");
                int stock = entrada.nextInt();
                Articulo.alta(cod, desc, prC, prV, stock);
                    break;
                case 3: 
                System.out.print("Ingrese el código del artículo a eliminar: ");
                int codBaja = entrada.nextInt();
                Articulo.baja(codBaja);
                    break;
                case 4:
                System.out.print("Ingrese el código del artículo: ");
                int codEntrada = entrada.nextInt();
                System.out.print("Ingrese la cantidad a agregar: ");
                int cantidadEntrada = entrada.nextInt();
                Articulo.entradaMercancia(codEntrada, cantidadEntrada);
                    break;
                case 5:
                System.out.print("Ingrese el código del artículo: ");
                int codSalida = entrada.nextInt();
                System.out.print("Ingrese la cantidad a retirar: ");
                int cantidadSalida = entrada.nextInt();
                Articulo.salidaMercancia(codSalida, cantidadSalida);                    
                    break;
                default:
                    break;
            }
        } while (opcion!=6);
        entrada.close();
    }
}
