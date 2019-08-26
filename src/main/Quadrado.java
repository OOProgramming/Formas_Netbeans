package main;

import javax.swing.JOptionPane;

/**
 *
 * @author DLT1CA
 */
public class Quadrado extends FormaGeometrica implements IBidmensional {

    private double lado;

    public Quadrado() {
       
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
         this.lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do Quadrado: "));
         cor = JOptionPane.showInputDialog("Digite a cor da forma: ");
         nome = JOptionPane.showInputDialog("Digite o nome da forma: ");
    }

}
