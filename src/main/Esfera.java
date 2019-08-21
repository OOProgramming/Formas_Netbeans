package main;

/**
 *
 * @author DLT1CA
 */
public class Esfera extends FormaGeometrica implements ITridmensional {

    private double raio;

    public Esfera(double raio, String cor, String nome) {
        super(cor, nome);
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

    
///
    @Override
    public double calcularVolume() {
        return 4 / 3 * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString() {
        return "Nome: "+super.getNome()+""
                + "Cor: "+super.getCor()+""
                + "\nRaio: " + raio+""
                + "\nVolume: "+calcularVolume();
    }

}
