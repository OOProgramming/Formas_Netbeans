package main;

/**
 *
 * @author DLT1CA
 */
public abstract class FormaGeometrica implements Comparable<FormaGeometrica>{

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

    @Override
    public int compareTo(FormaGeometrica forma) {
        int compareResult = this.getClass().getSimpleName().compareTo(forma.getClass().getSimpleName());
        if (compareResult < 0) return -1;
        if (compareResult > 0) return 1;
        return 0;
    }
    
    protected abstract void lerFoma();
}
