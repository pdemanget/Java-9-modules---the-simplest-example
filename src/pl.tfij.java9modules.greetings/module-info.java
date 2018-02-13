module pl.tfij.java9modules.greetings {

    requires pl.tfij.java9modules.app;
   provides pl.tfij.java9modules.app.IGreeting
            with pl.tfij.java9modules.greetings.Greeting;
}
