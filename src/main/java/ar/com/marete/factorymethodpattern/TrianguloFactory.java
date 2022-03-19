package ar.com.marete.factorymethodpattern;

/**
 * Para evitar que nuestros clientes deban conocer la estructura de nuestra jerarquia creamos un Factory de triangulos.
 */
public class TrianguloFactory {

    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC){

        if((ladoA== ladoB) && (ladoA == ladoC)){
            return new Equilatero(ladoA,ladoB,ladoC);
        }else if((ladoA != ladoB) && (ladoA!=ladoC) && (ladoB!=ladoC)){
            return new Escaleno(ladoA, ladoB,ladoC);
        }else{
             return new Isosceles(ladoA, ladoB, ladoC);
        }
    }

    /*
    * De esta forma, no solo no tienen que conocer nuestra estructura de clases, sino que ademas tampoco es necesario
    * que conozcan nuestra implementacion (el conocimiento del algoritmo que resuelve que clases se deben crear)
    * */
}
