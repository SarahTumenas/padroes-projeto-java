package javapuro;

import javapuro.facade.Facade;
import javapuro.singleton.SingletonEager;
import javapuro.singleton.SingletonLazy;
import javapuro.singleton.SingletonLazyHolder;
import javapuro.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Daleks dalek = new Daleks();
        dalek.setComportamento(normal);
        dalek.mover();
        dalek.mover();
        dalek.mover();
        dalek.setComportamento(defensivo);
        dalek.mover();
        dalek.mover();
        dalek.setComportamento(agressivo);
        dalek.mover();
        dalek.mover();
        dalek.mover();
        dalek.mover();
        dalek.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Xou da Xuxa", "22470");

    }
}
