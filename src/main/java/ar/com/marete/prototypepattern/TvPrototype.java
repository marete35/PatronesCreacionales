package ar.com.marete.prototypepattern;

import java.util.HashMap;

/**
 * Debido a que se decidio realizar ciertos prototipos, estos se ven plasmados en la clase TvPrototype.
 */
public class TvPrototype {

    private HashMap<String, TV> prototipos = new HashMap<>();

    public TvPrototype() {
        Plasma plasma = new Plasma("Sony", 21, "Plateado", 399.99,90,0.05);
        LCD lcd = new LCD("Panasonic", 42,"Plateado", 599.99,290);

        prototipos.put("Plasma", plasma);
        prototipos.put("LCD", lcd);
    }

    public Object prototipo(String tipo) throws CloneNotSupportedException{
        return prototipos.get(tipo).clone();
    }
}
