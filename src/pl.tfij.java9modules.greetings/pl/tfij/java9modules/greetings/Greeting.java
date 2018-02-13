package pl.tfij.java9modules.greetings;

public class Greeting implements pl.tfij.java9modules.app.IGreeting{

    public String regular(String party) {
        return "Hello, " + party + "!";
    }

}
