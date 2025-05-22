package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        //TODO naplnit osudí čísly 1 až 49.
        //zkouška interval
        for (int i = 0; i <= 49; i++) {
            osudi.add(i);
        }
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        //TODO zamíchat osudí
        //sort a reverse se mi nabízejí???
        //Collections.sort(osudi);
        //Collections.reverse(osudi);
        Collections.shuffle(osudi);  //Randomly permutes the specified list using a default source of randomness.
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        //TODO Vrátit seznam prvních 6 čísel z osudí.
        //for (int i = 0; i < 6; i++) {
            //osudi.get(i % 6);
        //}
        return osudi.subList(0, 6); //možná 1-7 nebo 0-6
        }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        //
        return osudi.get(7); //pořadí možná 6
        }
}
