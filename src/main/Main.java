package main;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        int opcaoMenu = 0;

        while (opcaoMenu != 3) {
            opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ao Construtor de Formas!"
                    + "\n\nDigite uma opção para escolher o "
                    + "tipo de forma que deseja criar: \n\n"
                    + "1 - Adicionar Forma\n"
                    + "2 - Listar Formas Ordenadas\n"
                    + "3 - Sair"));

            switch (opcaoMenu) {

                case 1:
                    String opcaoTipoDeForma = JOptionPane.showInputDialog("Bem-vindo ao Construtor de Formas!"
                            + "\n\nDigite uma opção para escolher o "
                            + "tipo de forma que deseja criar: \n\n"
                            + "1 - Bidimensional\n"
                            + "2 - Tridimensional\n");

                    if (opcaoTipoDeForma.equals("1")) {

                        String opcaoFormaBidmensional = JOptionPane.showInputDialog("Digite uma opção para escolher"
                                + " a forma que deseja criar: \n\n"
                                + "1 - Quadrado\n"
                                + "2 - Triângulo\n");

                        if (opcaoFormaBidmensional.equals("1")) {
                            formas.add(new Quadrado(1, "", ""));
                        }
                        if (opcaoFormaBidmensional.equals("2")) {
                            formas.add(new Triangulo(0, 0, 0, 0, 0, "", ""));
                        }
                    }

                    if (opcaoTipoDeForma.equals("2")) {

                        String opcaoFormaTridmensional = JOptionPane.showInputDialog("Digite uma opção para escolher"
                                + " a forma que deseja criar: \n\n"
                                + "1 - Cubo\n"
                                + "2 - Esfera\n");

                        if (opcaoFormaTridmensional.equals("1")) {
                            formas.add(new Cubo(0, "", ""));
                        }
                        if (opcaoFormaTridmensional.equals("2")) {
                            formas.add(new Esfera(0, "", ""));
                        }

                    }
                    break;

                case 2:
                    Collections.sort(formas);

                    String output = "";

                    for (FormaGeometrica forma : formas) {
                        String nomedaForma = forma.getClass().getSimpleName();
                        output += nomedaForma + "\n";
                    }

                    JOptionPane.showMessageDialog(null, output);
                    break;

            }
        }
    }
}
