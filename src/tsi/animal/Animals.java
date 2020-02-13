package tsi.animal;

public class Animals {
    public static void main(String[] args){
        Cat cat = new Cat("Dog");
        cat.sound();
        cat.printName();
        Dog dog = new Dog( "Cat");
        dog.sound();
        dog.printName();
        Fox fox = new Fox( "Cat");
        fox.sound();
        fox.secretSkill();
    }
}
