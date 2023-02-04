package interfaces;

import javax.sound.midi.Soundbank;

public class Animal {
    String name;

    public Animal () {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierzę " + name;
    }

    String makeSound() {
        return "???";
    }

    void intruduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }


}
