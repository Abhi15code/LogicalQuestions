package factoryDesign;

public class client1 extends animalFactory {public static void main(String[] args) {
    
    
    animal animal1 = animalFactory.getAnimal("dog")  ;
    animal1.eat();
    animal animal2 = animalFactory.getAnimal("cat") ;
    animal2.eat();
    animal2.sleep();

}

    
    
}
