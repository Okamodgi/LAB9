public class Cat extends Animal {
    String color;

    public Cat(String f, String l, String c){
        this.food = f;
        this.location = l;
        this.color = c;
    }

    public void makeNoise() {
        System.out.println("Кошка говорит мяу");
    }

    public void eat() {
        System.out.println("Кошка ест " + food);
    }

    public void sleep() {
        System.out.println("Кошка спит в " + location);
    }

    public void dispColor(){
        System.out.println("У кошки расцветка - " + color);
    }
}
