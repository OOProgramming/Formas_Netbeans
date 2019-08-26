package main;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class InterfaceUsuario {

    private int opcaoMenu = 0;

    public int menuPrincipal() {

        opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ao Construtor de Formas!"
                + "\n\nDigite uma opção para escolher o "
                + "tipo de forma que deseja criar: \n\n"
                + "1 - Adicionar Forma\n"
                + "2 - Listar Formas Ordenadas\n"
                + "3 - Sair"));

        return opcaoMenu;
    }

    public String menuOpcaoTipoDeForma() {

        String opcaoTipoDeForma = JOptionPane.showInputDialog("Bem-vindo ao Construtor de Formas!"
                + "\n\nDigite uma opção para escolher o "
                + "tipo de forma que deseja criar: \n\n"
                + "1 - Bidimensional\n"
                + "2 - Tridimensional\n");

        return opcaoTipoDeForma;
    }

    public String menuOpcaoFormaBidimensional() {

        String opcaoFormaBidmensional = JOptionPane.showInputDialog("Digite uma opção para escolher"
                + " a forma que deseja criar: \n\n"
                + "1 - Quadrado\n"
                + "2 - Triângulo\n");

        return opcaoFormaBidmensional;
    }

    public String menuOpcaoFormaTridimensional() {

        String opcaoFormaTridmensional = JOptionPane.showInputDialog("Digite uma opção para escolher"
                + " a forma que deseja criar: \n\n"
                + "1 - Cubo\n"
                + "2 - Esfera\n");

        return opcaoFormaTridmensional;
    }

    public void listarFormas(ArrayList<FormaGeometrica> formas) {

        Collections.sort(formas);

        String output = "";

        for (FormaGeometrica forma : formas) {
            String nomedaForma = forma.nome;
            output += nomedaForma + "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
