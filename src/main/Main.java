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
        String opcaoTipoDeForma = "";
        String opcaoFormaBidmensional = "";
        String opcaoFormaTridmensional = "";

        while (opcaoMenu != 3) {

            InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

            opcaoMenu = interfaceUsuario.menuPrincipal();

            switch (opcaoMenu) {

                case 1:
                    opcaoTipoDeForma = interfaceUsuario.menuOpcaoTipoDeForma();

                    if (opcaoTipoDeForma.equals("1")) {

                        opcaoFormaBidmensional = interfaceUsuario.menuOpcaoFormaBidimensional();

                        if (opcaoFormaBidmensional.equals("1")) {
                            formas.add(new Quadrado(1, "", "")); //Implementar leitura de informações das formas através do JOptionPane.
                        }
                        if (opcaoFormaBidmensional.equals("2")) {
                            formas.add(new Triangulo(0, 0, 0, 0, 0, "", ""));
                        }
                    }

                    if (opcaoTipoDeForma.equals("2")) {

                        opcaoFormaTridmensional = interfaceUsuario.menuOpcaoFormaTridimensional();

                        if (opcaoFormaTridmensional.equals("1")) {
                            formas.add(new Cubo(0, "", ""));
                        }
                        if (opcaoFormaTridmensional.equals("2")) {
                            formas.add(new Esfera(0, "", ""));
                        }

                    }
                    break;

                case 2:

                    interfaceUsuario.listarFormas(formas);

                    break;

            }
        }
    }
}
