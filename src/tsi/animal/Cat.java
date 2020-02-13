package tsi.animal;

public class Cat implements Animal,Domestic{
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void printName() {
        System.out.println("Myname" +name);
    }
}
