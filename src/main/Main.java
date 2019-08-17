package main;

import java.util.ArrayList;



/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {
        FormaGeometrica cubo = new Cubo(10, "Azul");
        FormaGeometrica quadrado = new Quadrado(20, "Verde");
        FormaGeometrica triangulo = new Triangulo(4.6, 4.6, 4.6, 4.6, 4.6, "Vermelho");
        FormaGeometrica esfera = new Esfera(4.6, "Amarelo");
        
        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        
        formas.add(cubo);
        formas.add(quadrado);
        formas.add(triangulo);
        formas.add(esfera);
        

        for (FormaGeometrica forma : formas) {
            System.out.println("\nForma: "+forma.getClass().getTypeName().substring(5)+
            "\nInformações da forma: \n"+forma.toString());
            
            System.out.println("______________________");
        }
        
        
        
        
        
    }
}
