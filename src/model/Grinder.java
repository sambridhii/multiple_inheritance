package model;

public class Grinder extends Electronic {
    int bladeSpeed;
    public Grinder(boolean warranty, int bladeSpeed) {
        super(warranty, bladeSpeed);
        this.bladeSpeed = bladeSpeed;
    }
    public void getProduct(){
        System.out.println("Product: Grinder");
    }
}
