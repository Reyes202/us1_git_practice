package day38_encapsulation.Street;

public class TrafficLight {
    private String color;
    public TrafficLight (String color){
        setColor(color);
    }
    public String getColoor (){
        return  color;

    }
    public void setColor(String color ){
        if(color.equals("green") || color.equals("red") || color.equals("yellow") ){
            this.color=color;

        }
    }
}
