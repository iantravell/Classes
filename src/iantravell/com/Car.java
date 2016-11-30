package iantravell.com;

/**
 * Created by iantravell on 25/11/2016.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String Colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
