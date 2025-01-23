package factoryDesign;

public class catfactory implements animalfactory2{

    @Override
    public animal createAnimalfactory() {
        return new cat();
    
    }
    

}
