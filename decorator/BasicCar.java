package Complete_Design_Patterns.decorator;

public class BasicCar implements Car {
	 
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
 
}