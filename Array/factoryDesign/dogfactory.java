package factoryDesign;

public class dogfactory implements animalfactory2{

    @Override
    public animal createAnimalfactory() {
        return new dog();
    
    }

}
