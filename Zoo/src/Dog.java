public class Dog extends Animal {

    public Dog(String name, double height, double weight) {
        super(name, height, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
