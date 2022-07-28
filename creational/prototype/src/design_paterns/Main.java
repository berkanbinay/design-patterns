package design_paterns;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Berkan", "Binay", 22);

        Human human2 = (Human) human1.getClone();
    }
}
