import java.util.*;

interface Camera{
    void photo();
}

interface Musicplayer{
    void play();
}

class Smartphone implements Camera, Musicplayer{
    private String brand;

    Smartphone(String Brand){
        this.brand = brand;
    }

    public void photo() {
        System.out.println("Click...");

    }
    public void play() {
        System.out.println("Playing....");


    }
}

public class Main3{
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Realme....");

        smartphone.photo();

        smartphone.play();
    }
}

