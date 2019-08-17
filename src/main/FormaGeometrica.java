package main;

/**
 *
 * @author DLT1CA
 */
public abstract class FormaGeometrica {

    private String cor;
    
    //<editor-fold desc="Getters and Setters">
    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    //</editor-fold>

    public abstract String obterCor();

    
}
