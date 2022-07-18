/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra6_ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AhorcadoService as = new AhorcadoService();
        Ahorcado a1 = as.crearJuego();
        
        do {
            System.out.println("Ingrese una letra a buscar");
            String letra = scan.nextLine();
            while(as.controlarRepetidas(a1, letra)){
                System.out.println("Esa letra ya se encontro! Elija una nueva letra");
                letra = scan.nextLine();
            }
            as.juego(a1, letra);
        } while (as.intentos(a1) > 0 && a1.letrasEncontradas != a1.vectorPalabra.length);
        
        if(as.intentos(a1) == 0){
            System.out.println("\nLo siento has perdido, no te quedan oportunidades :( ");
        } else {
            System.out.println("\nFelicidades! Adivinaste la palabra " + Arrays.toString(a1.vectorPalabra));
        }
    }
}
