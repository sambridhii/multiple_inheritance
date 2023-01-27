package model;

public class DryGrinder extends Grinder {

    public DryGrinder(boolean warranty, int bladeSpeed, String makeyear) {
        super(warranty, bladeSpeed);
        this.makeyear = makeyear;
    }

    public String getMakeyear() {
        return makeyear;
    }

    public void setMakeyear(String makeyear) {
        this.makeyear = makeyear;
    }

    String makeyear;
    public void getGrindertype(){
        System.out.println("Grinder Type: Dry Grinder");
    }
}
