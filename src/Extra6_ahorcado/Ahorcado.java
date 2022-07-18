/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra6_ahorcado;

import java.util.ArrayList;

/**
 *
 * @author Milagros
 */
public class Ahorcado {

    String vectorPalabra[];
    ArrayList letrasYaBuscadas;
    int letrasEncontradas;
    int jugadasMax;
    int intentosFallidos;

    public Ahorcado(String[] vectorPalabra, String[] vectorVacio, int letrasEncontradas, int jugadasMax, int oportunidades) {
        //this.vectorPalabra = vectorPalabra;
        //this.vectorVacio = vectorVacio;
        //this.letrasEncontradas = 0;
        //this.jugadasMax = jugadasMax;
        //this.intentosFallidos = 0;
    }

    public Ahorcado() {
        jugadasMax = 0;
        letrasEncontradas = 0;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "vectorPalabra=" + vectorPalabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMax=" + jugadasMax + ", intentosFallidos=" + intentosFallidos + '}';
    }

}
