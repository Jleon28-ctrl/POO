package ESFOT;

public class Estudiante  extends Persona{
    private double promedio;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double valor) {
        if(valor >= 0 || valor <=20 ) this.promedio = valor;
        else System.out.println("Valor incorrecto");
    }

    public void imprimirPromedio(){
        System.out.println("Promedio: " + this.promedio);
    }

    @Override
    public  void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Promedio: " + this.promedio);
    }
}
