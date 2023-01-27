import model.DryGrinder;
import model.Grinder;


public class Main {
    public static void main(String[] args) {
        DryGrinder dryGrinder = new DryGrinder (true,1,"2015");
        DryGrinder dryGrinder1= new DryGrinder(true,11,"2016");
        dryGrinder.getProduct();
        dryGrinder.getDevice();
        dryGrinder.getGrindertype();

        System.out.println(dryGrinder.isWarranty());
        System.out.println(dryGrinder.getBladespeed());
        System.out.println(dryGrinder.getMakeyear());


        System.out.println(dryGrinder1.isWarranty());
        System.out.println(dryGrinder1.getMakeyear());
        System.out.println(dryGrinder1.getBladespeed());




    }
}
