package tsi.animal;

public class Dog implements Animal,Domestic{
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("gav");
}

    @Override
    public void printName() {
        System.out.println("Myname" +name);
    }
    }
