package factoryDesign;

public class animalFactory {
    public static animal getAnimal(String animalName){
        if(animalName.equalsIgnoreCase("cat")){
            return new cat();
        }
        else{
            return new dog();

        }

    }
}
