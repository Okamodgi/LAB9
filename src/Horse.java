public class Horse extends Animal{
    String breed;

    public Horse(String f, String l, String b){
        this.food = f;
        this.location = l;
        this.breed = b;
    }

    public void makeNoise() {
        System.out.println("Лошадь говорит игого");
    }


    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    public void sleep() {
        System.out.println("Лошадь спит в " + location);
    }

    public void dispBreed(){
        System.out.println("У лошади порода - " + breed);
    }
}