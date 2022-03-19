package ar.com.marete.factorymethodpattern;

public class App {

    public static void main(String[] args) {

        //Cabe aclarar que las clases Factory deberian ser Singleton, pero para evitar
        //confundir al estudiante nos hemos concentrado solo en este patron.
        TrianguloFactory factory = new TrianguloFactory();

        Triangulo triangulo = factory.createTriangulo(10,10,10);
        System.out.println(triangulo.getDescripcion());
    }
}
