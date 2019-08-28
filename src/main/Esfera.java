package main;

import javax.swing.JOptionPane;

/**
 *
 * @author DLT1CA
 */
public class Esfera extends FormaGeometrica implements ITridmensional {

    private double raio;

    public Esfera() {
        
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
        return "Nome: "+super.getNome()+"\n"
                + "Cor: "+super.getCor()
                + "\nRaio: " + raio
                + "\nVolume: "+calcularVolume();
    }

    @Override
    protected void lerForma() {
         this.raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da Esfera: "));
         cor = JOptionPane.showInputDialog("Digite a cor da forma: ");
         nome = JOptionPane.showInputDialog("Digite o nome da forma: ");
    }

}
