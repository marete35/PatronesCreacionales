package ar.com.marete.prototypepattern;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        TvPrototype tvp = new TvPrototype();
        TV tv = (TV) tvp.prototipo("Plasma");
        System.out.println(tv.getPrecio());
    }
}
