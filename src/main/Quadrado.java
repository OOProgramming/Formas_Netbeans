package main;

/**
 *
 * @author DLT1CA
 */
public class Quadrado extends FormaGeometrica implements IBidmensional{

    private double lado;

    public Quadrado(double lado, String cor) {
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String obterCor() {
        return getCor();
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "\nLado: "+lado+""
                + "\nArea: "+calcularArea()+""
                + "\nPerimetro: "+calcularPerimetro();
    }
    
    
    
}
