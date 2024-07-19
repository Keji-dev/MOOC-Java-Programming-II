
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
        
        System.out.println();
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
        
        System.out.println();
        NoiseCapable dog1 = new Dog();
        dog1.makeNoise();

        NoiseCapable cat1 = new Cat("Garfield");
        cat1.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

}
