/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra6_ahorcado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class AhorcadoService {

    Scanner scan = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra para el juego");
        String palabra = scan.nextLine();
        a1.vectorPalabra = new String[palabra.length()];
        a1.letrasYaBuscadas = new ArrayList(palabra.length());

        for (int i = 0; i < palabra.length(); i++) {
            a1.vectorPalabra[i] = palabra.substring(i, i + 1);
            a1.letrasYaBuscadas.add(" _ ");
        }

        System.out.println("Ingrese la cantidad de jugadas máximas que puede realizar el usuario");
        a1.setJugadasMax(scan.nextInt());
        return a1;
    }

    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra es: " + a1.vectorPalabra.length);
    }

    public void buscarLetra(String letra, Ahorcado a1) {
        int cont = 0;
        /*
        for (String elemento : a1.vectorPalabra) {
            if (elemento.equals(letra)) {
                cont++;
                System.out.print(" " + letra + " ");
            } else {
                System.out.print(" _ ");
            }
        }
         */

        for (int i = 0; i < a1.vectorPalabra.length; i++) {
            if (a1.vectorPalabra[i].equals(letra)) {
                a1.letrasYaBuscadas.set(i, letra);
                cont++;
            }
        }
        System.out.println(a1.letrasYaBuscadas.toString());

        if (cont > 0) {
            System.out.println("\nLa letra elegida se encuentra en la palabra");
            a1.letrasEncontradas += cont;
        } else {
            System.out.println("\nEsa letra no se encuentra en la palabra :( ");
            a1.intentosFallidos++;
        }
    }

    public void encontradas(Ahorcado a1) {
        System.out.println("Cantidad de letras encontradas " + a1.getLetrasEncontradas());
        System.out.println("Cantidad de letras que faltan " + (a1.vectorPalabra.length - a1.letrasEncontradas));
    }

    public int intentos(Ahorcado a1) {
        return a1.jugadasMax - a1.intentosFallidos;
    }

    public void juego(Ahorcado a1, String letra) {
        longitud(a1);
        buscarLetra(letra, a1);
        encontradas(a1);
        System.out.println("Oportunidades restantes " + intentos(a1) + "\n");
    }

    public boolean controlarRepetidas(Ahorcado a1, String letra) {
        boolean repetido = false;
        for (Object letrasYaBuscada : a1.letrasYaBuscadas) {
            if (letrasYaBuscada.equals(letra)) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }
}
