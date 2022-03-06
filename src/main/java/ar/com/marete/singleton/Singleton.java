package ar.com.marete.singleton;

/**
 * Thread safe Singleton
 * @author lic.galarza@hotmail.com
 */
public class Singleton {

    private static Singleton instance;

    /**
     * Para evitar instancia mediante el operador new.
     */
    private Singleton(){
    }

    /**
     * Metodo que retorna la unica instancia de la clase. En caso que no exista se crea la primera vez.
     * @return
     */
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    System.out.println("Se creo la unica instancia");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
