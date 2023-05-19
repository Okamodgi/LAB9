public class Dog extends Animal {
    int age;

    public Dog(String f, String l, int a){
        this.food = f;
        this.location = l;
        this.age = a;
    }

    public void makeNoise() {
        System.out.println("Собака говорит гав гав");
    }

    public void eat() {
        System.out.println("Собака ест " + food);
    }

    public void sleep() {
        System.out.println("Собака спит в " + location);
    }

    public void dispBreed(){
        System.out.println("Собаке " + age + " лет" );
    }
}