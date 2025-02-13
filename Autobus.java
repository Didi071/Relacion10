package Relacion10;

public class Autobus {
    //atributos
    String matricula;
    String modelo;
    String potenciaCV;
    int numeroPlazas;

    //metodos
    public Autobus (int numeroPlazas){
        this.numeroPlazas = numeroPlazas;
    }
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPotenciaCV() {
        return potenciaCV;
    }
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
}
