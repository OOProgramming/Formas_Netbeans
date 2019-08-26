package main;

import javax.swing.JOptionPane;

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

    public Triangulo() {
       
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
        return "Nome: "+super.getNome()+"\n"
                + "Cor: "+super.getCor()
                + "\nAltura: " + altura 
                + "\nBase: " + base
                + "\nLado A: " + A
                + "\nLado B: " + B 
                + "\nLado C: " + C
                + "\nArea: " + calcularArea()
                + "\nPerimetro: " + calcularPerimetro();
    }

    @Override
    protected void lerFoma() {
         this.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Triângulo: "));
         this.base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do Triângulo: "));
         this.A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Lado A do Triângulo: "));
         this.B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Lado B do Triângulo: "));
         this.C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Lado C do Triângulo: "));
         cor = JOptionPane.showInputDialog("Digite a cor da forma: ");
         nome = JOptionPane.showInputDialog("Digite o nome da forma: ");
    }
}
