package factoryDesign;

public class client2 {
    public static void main(String[] args) {
        catfactory catt = new catfactory();
        animal cat = catt.createAnimalfactory();
        cat.eat();
        cat.sleep();

        dogfactory dogg = new dogfactory();
        animal dog = dogg.createAnimalfactory();
        dog.eat();
        

    }
}
