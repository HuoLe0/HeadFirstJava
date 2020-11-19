import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args){
        new TestGenerics1().go();
    }

    private void go() {
//        Animal [] animals = {new Dog(), new Cat(), new Dog()};
//        Dog [] dogs = {new Dog(), new Dog(), new Dog()};
//        takeAnimals(animals);
//        takeAnimals(dogs);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        takeAnimals(animals);
    }

//    private void takeAnimals(Animal[] animals) {
    private void takeAnimals(ArrayList<Animal> animals){
        for (Animal a : animals){
            a.eat();
        }
    }

    abstract class Animal {
        void eat(){
            System.out.println("animal eating");
        }
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("汪汪汪");
        };
    }

    class Cat extends Animal{
        void meow(){
            System.out.println("喵喵喵");
        };
    }
}
