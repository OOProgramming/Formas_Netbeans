package main;

/**
 *
 * @author DLT1CA
 */
public abstract class FormaGeometrica {

    private String nome;
    private String cor;

    public FormaGeometrica(String cor,String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    //<editor-fold desc="Getters and Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    //</editor-fold>

}
