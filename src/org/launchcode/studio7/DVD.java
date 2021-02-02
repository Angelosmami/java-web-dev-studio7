package org.launchcode.studio7;

public class DVD extends BaseDisc{

    private String movieScenes;

    public String getMovieScenes(){return this.movieScenes;}

    public DVD(boolean spin, int capacity, String discType, String movieScenes){
        super(spin,capacity,discType);
        this.movieScenes = movieScenes;
    }

    public void spinDisc(){
        System.out.println("Movie data is stored");
    }

    public void writeData(){
        System.out.println("DVD data written");
    }

    public void readData(){
        System.out.println("Playing DVD");
    }

    @Override
    public void playDisc(){
        System.out.println("To play the DVD please press play");
    }

    public void pauseDVD(){
        System.out.println ("The movie is paused");
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
