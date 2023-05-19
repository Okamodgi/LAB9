public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("мясо", "будке", 8);                           //конструктор
        Cat cat1 = new Cat("рыба", "коврик", "белый");
        Horse horse1 = new Horse("сено", "конюшня",  "русская");
        Vet vet1 = new Vet();
        vet1.treatAnimal(dog1);
        cat1.makeNoise();
        cat1.dispColor();
        horse1.eat();
        dog1.sleep();
        horse1.dispBreed();
    }
}