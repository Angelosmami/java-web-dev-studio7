package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisk{

    private boolean load;
    private int capacity;
    private String  discType;


    public BaseDisc (boolean load, int capacity, String discType){
        this.load = load;
        this.capacity = capacity;
        this.discType = discType;
    }

    public boolean getSpin() {return this.load;}
    public int getCapacity() {return this.capacity;}
    public String getDiscType() {return this.discType;}


    public void playDisc(){
        System.out.println("Press play");
    }

}
