public class Cat extends Animal {

    public Cat(String name, double height, double weight) {
        super(name, height, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
