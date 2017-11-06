public class Main {

    public static void main(String [] args) {
        System.out.println("Start Program");

        Animal dog = new Dog("Bob", 0.75, 7.2);
        Animal cat = new Cat("Kitty", 0.43, 3.4);

        dog.makeSound();
        cat.makeSound();
    }
}
