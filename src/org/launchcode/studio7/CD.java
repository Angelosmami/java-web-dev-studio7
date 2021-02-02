package org.launchcode.studio7;

public class CD extends BaseDisc {

    private String songNames;

    public String getSongNames(){return this.songNames;}

    public CD(boolean spin, int capacity, String discType, String songNames){
        super(spin,capacity,discType);
        this.songNames = songNames;
    }

    public void spinDisc(){
        System.out.println("Music data is stored");
    }

    public void writeData(){
        System.out.println("Music data written");
    }

    public void readData(){
        System.out.println("Playing CD");
    }

    @Override
    public void playDisc(){
        System.out.println("To play the CD please press play");
    }

    public void repeatSong(){
        System.out.println("Lets play this song again");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
