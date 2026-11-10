package ESFOT;

public class Pasante extends Estudiante {
    double porcentajeBeca;

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }

    public void imprimirPorcentajeBeca(){
        System.out.println("Porcentaje Beca: " + this.porcentajeBeca);
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Porcentaje Beca: " + this.porcentajeBeca);
    }
}
