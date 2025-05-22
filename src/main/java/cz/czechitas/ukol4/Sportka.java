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
        //nešel by nějaký interval pro naplnění 1-49??? něco jako for i (i=1, i++, i < 50)
        osudi.add(1);
        osudi.add(2);
        osudi.add(3);
        osudi.add(4);
        osudi.add(5);
        osudi.add(6);
        osudi.add(7);
        osudi.add(8);
        osudi.add(9);
        osudi.add(10);
        osudi.add(11);
        osudi.add(12);
        osudi.add(13);
        osudi.add(14);
        osudi.add(15);
        osudi.add(16);
        osudi.add(17);
        osudi.add(18);
        osudi.add(19);
        osudi.add(20);
        osudi.add(21);
        osudi.add(22);
        osudi.add(23);
        osudi.add(24);
        osudi.add(25);
        osudi.add(26);
        osudi.add(27);
        osudi.add(28);
        osudi.add(29);
        osudi.add(30);
        osudi.add(31);
        osudi.add(32);
        osudi.add(33);
        osudi.add(34);
        osudi.add(35);
        osudi.add(36);
        osudi.add(37);
        osudi.add(38);
        osudi.add(39);
        osudi.add(40);
        osudi.add(41);
        osudi.add(42);
        osudi.add(43);
        osudi.add(44);
        osudi.add(45);
        osudi.add(46);
        osudi.add(47);
        osudi.add(48);
        osudi.add(49);
        }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        //TODO zamíchat osudí
        //sort a reverse se mi nabízejí sami???
        Collections.sort(osudi);
        Collections.reverse(osudi);
        Collections.shuffle(osudi);  //Randomly permutes the specified list using a default source of randomness.
        return;
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        //TODO Vrátit seznam prvních 6 čísel z osudí.
        osudi.get(1); //nešel by interval for
        osudi.get(2); //to nebude prosté get,jde o pozici v seznamu - přiřad pozici?
        osudi.get(3);
        osudi.get(4);
        osudi.get(5);
        osudi.get(6);
        return osudi;

        }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        //
        return osudi.get(7); //to není prostá sedmička, jde o pořadí
        }
}
