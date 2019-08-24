package main;

/**
 *
 * @author DLT1CA
 */
public class Triangulo extends FormaGeometrica implements IBidmensional {

    private double altura;
    private double base;
    private double A;
    private double B;
    private double C;

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    //</editor-fold>

    public Triangulo(double altura, double base, double A, double B, double C, String cor, String nome) {
        super(cor, nome);
        this.altura = altura;
        this.base = base;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return A + B + C;
    }

    @Override
    public String toString() {
        return "Nome: "+super.getNome()+""
                + "Cor: "+super.getCor()+""
                + "\nAltura: " + altura + ""
                + "\nBase: " + base + ""
                + "\nLado A: " + A + ""
                + "\nLado B: " + B + ""
                + "\nLado C: " + C + ""
                + "\nArea: " + calcularArea() + ""
                + "\nPerimetro: " + calcularPerimetro();
    }

    @Override
    protected void lerFoma() {

    }
}
