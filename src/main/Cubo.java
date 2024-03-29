/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DLT1CA
 */
public class Cubo extends FormaGeometrica implements ITridmensional {

    private double aresta;

    public Cubo(double aresta, String cor) {
        super(cor);
        this.aresta = aresta;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    //</editor-fold>

    @Override
    public String obterCor() {
        return getCor();
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }

    @Override
    public String toString() {
        return "\nAresta: " + aresta+""
                + "\nVolume: "+calcularVolume();
    }

}
