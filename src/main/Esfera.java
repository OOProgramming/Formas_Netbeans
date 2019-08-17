package main;

/**
 *
 * @author DLT1CA
 */
public class Esfera extends FormaGeometrica implements ITridmensional {

    private double raio;

    public Esfera(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    //</editor-fold>

    @Override
    public String obterCor() {
        return getCor();
    }
///
    @Override
    public double calcularVolume() {
        return 4 / 3 * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString() {
        return "\nRaio: " + raio+""
                + "\nVolume: "+calcularVolume();
    }

}
