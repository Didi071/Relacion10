package Relacion10;

public class PruebaArticulo {
    //Atributos
    int objetoAlmacenado = 0;
    int tamañoArray;
    private Articulo[] articulos;

    //Metodo constructor
    public PruebaArticulo (int tamañoArray){
        this.tamañoArray = tamañoArray;
        this.articulos = new Articulo[tamañoArray];
    }

    //Metodo almacena
    public boolean Almacena (Articulo a1){
        if (objetoAlmacenado<tamañoArray){
            articulos[objetoAlmacenado] = a1;
            objetoAlmacenado ++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String articulo="";
        for (int i = 0; i < objetoAlmacenado; i++) {
            articulo += articulos[i].toString();
            articulo += "\n";}
        return articulo.toString();
    }

}
