package Relacion10;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Articulo a1 = new Articulo(110, "Raqueta de tenis");
        Articulo a2 = new Articulo(120, "Pelota de baloncesto");
        Articulo a3 = new Articulo(130, "Guantes de boxeo");

        Articulo[] articulos =  {a1, a2, a3};
        for(Articulo auxArticulo:articulos){
            if (auxArticulo!=null){
                System.out.println("El articulo es: " + auxArticulo.getDescripcion());
            }
        }

        Articulo[] articulos2 = new Articulo[3];
        articulos2[0] = new Articulo(110, "Raqueta de tenis");
        articulos2[1] = new Articulo(120, "Pelota de baloncesto");
        articulos2[2] = new Articulo(130, "Guantes de boxeo");
        for(Articulo auxArticulo:articulos2){
            if (auxArticulo!=null){
                System.out.println("El articulo es: " + auxArticulo.getDescripcion());
            }
        }
    }
}
