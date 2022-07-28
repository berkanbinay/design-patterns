package design_paterns;

public class Human implements Prototype{
    private String name;
    private String lastName;
    private int age;

    public Human(){
        System.out.println("\n Human description ");
        System.out.println("---------------------------------");
        System.out.println("Name"+"\t"+"Last Name"+"\t"+"Age");
    }

    public Human(String name, String lastName, int age) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        showHuman();
    }

    private void showHuman(){
        System.out.println(name+"\t"+lastName+"\t"+age);
    }

    @Override
    public Prototype getClone() {
        return new Human(name, lastName, age);
    }
}
