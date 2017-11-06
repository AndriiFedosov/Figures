package figures;

import java.text.DecimalFormat;

//create class figures for extending
public abstract class Figures{
    //create fields
    private String color;
    private double area;


    //create getters and setters
    public  String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    //create void toString
    @Override
    public String toString() {
        return  "площадь: "+ new DecimalFormat("#0.00").format(area) +" кв.ед, цвет: " + color+", ";
    }
    //create void to change color of figure.
    static String colors(){
        String [] colors = new String[]{
                "красный","оранжевый","желтый",
                "зеленый","голубой","синий",
                "фиолетовый","черный","белый"
        };
        return colors[(int)(Math.random()*8)];
    }
}
