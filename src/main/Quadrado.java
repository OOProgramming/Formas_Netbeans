package main;

/**
 *
 * @author DLT1CA
 */
public class Quadrado extends FormaGeometrica implements IBidmensional {

    private double lado;

    public Quadrado(double lado, String cor, String nome) {
        super(cor, nome);
        this.lado = lado;
    }

    
    //<editor-fold desc="Getters and Setters">
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    //<editor-fold>

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Nome: "+super.getNome()+""
                + "Cor: "+super.getCor()+""
                + "\nLado: " + lado + ""
                + "\nArea: " + calcularArea() + ""
                + "\nPerimetro: " + calcularPerimetro();
    }

    @Override
    protected void lerFoma() {

    }

}
