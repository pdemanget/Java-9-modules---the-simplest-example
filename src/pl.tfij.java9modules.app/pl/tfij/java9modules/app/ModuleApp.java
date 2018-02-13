package pl.tfij.java9modules.app;


import java.util.ServiceLoader;

public class ModuleApp {

    public static void main(String[] args) {
        ServiceLoader<IGreeting> sl = ServiceLoader.load(IGreeting.class);
        IGreeting greeting = sl.findFirst().orElseThrow(NullPointerException::new);
        System.out.println( greeting.regular("world"));
    }


}
