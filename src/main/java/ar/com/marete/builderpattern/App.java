package ar.com.marete.builderpattern;

public class App {

    public static void main(String[] args) {
        AutoDirector director = new AutoDirector();
        director.setAutoBuilder(new FordBuilder());
        director.constructAuto();
        Auto auto = director.getAuto();
    }
}
