package factoryDesign;
interface vhicle{
    public void wheel();
    public void power();
}
class vhiclefactory{
    public static vhicle getvhicle(String vName){
        if(vName.equalsIgnoreCase("car")){
            return new car();
        }else{
            return new bike();
        }
    }
}
class car implements vhicle{

    @Override
    public void power() {
    System.out.println("power method 1250 cc");
        
    }

    @Override
    public void wheel() {
      System.out.println("wheen method 4 wheel");
    }

}



class bike implements vhicle{

    @Override
    public void power() {
       System.out.println("power bike 100cc");
    }

    @Override
    public void wheel() {
       System.out.println("wheel bike 2 wheel");
        
    }
    
}

public class classMain {
    
    public static void main(String[] args) {
        vhicle car = vhiclefactory.getvhicle("car");
        car.wheel();

        vhicle bike = vhiclefactory.getvhicle("Bike");
        bike.wheel();
    }
}
