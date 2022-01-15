package javapuro.singleton;
/**
 * Singleton "apressado".
 *
 * @author SarahTumenas
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super ();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
