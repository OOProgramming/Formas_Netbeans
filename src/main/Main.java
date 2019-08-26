package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        int opcaoMenu = 0;
        String opcaoTipoDeForma;
        String opcaoFormaBidmensional;
        String opcaoFormaTridmensional;

        while (opcaoMenu != 3) {

            InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

            opcaoMenu = interfaceUsuario.menuPrincipal();

            switch (opcaoMenu) {

                case 1:
                    opcaoTipoDeForma = interfaceUsuario.menuOpcaoTipoDeForma();

                    if (opcaoTipoDeForma.equals("1")) {

                        opcaoFormaBidmensional = interfaceUsuario.menuOpcaoFormaBidimensional();

                        if (opcaoFormaBidmensional.equals("1")) {

                            Quadrado quadrado = new Quadrado();
                            quadrado.lerFoma();

                            formas.add(quadrado);
                            
                            JOptionPane.showConfirmDialog(null, quadrado.toString());
                        }
                        if (opcaoFormaBidmensional.equals("2")) {

                            Triangulo triangulo = new Triangulo();
                            triangulo.lerFoma();

                            formas.add(triangulo);
                        }
                    }

                    if (opcaoTipoDeForma.equals("2")) {

                        opcaoFormaTridmensional = interfaceUsuario.menuOpcaoFormaTridimensional();

                        if (opcaoFormaTridmensional.equals("1")) {

                            Cubo cubo = new Cubo();
                            cubo.lerFoma();

                            formas.add(cubo);
                        }
                        if (opcaoFormaTridmensional.equals("2")) {

                            Esfera esfera = new Esfera();
                            esfera.lerFoma();

                            formas.add(esfera);
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
