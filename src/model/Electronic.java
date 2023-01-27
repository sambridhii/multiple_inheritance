package model;

public class Electronic {

    String company = "baltra";
    boolean warranty;
    int bladeSpeed;
    public Electronic(boolean warranty, int bladeSpeed) {
        this.warranty = warranty;
        this.bladeSpeed = bladeSpeed;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public int getBladespeed() {
        return bladeSpeed;
    }

    public void setBladespeed(int bladeSpeed) {
        this.bladeSpeed = bladeSpeed;
    }

    public void getDevice(){

        System.out.println("Device: Electronic");
    }


}

