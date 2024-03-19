class Animals {
    String makeSound() {
        return "Animals makes a sound";
    }
}

class Doggy extends Animals {
    String makeSound() {
        return "Doggy barks";
    }
}

class Cat extends Animals {
    String makeSound() {
        return "Cat meows";
    }
}

public class TestPoly {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Animals doggy = new Doggy();
        Animals cat = new Cat();
        System.out.println(animals.makeSound());
        System.out.println(doggy.makeSound());
        System.out.println(cat.makeSound());
    }
}
