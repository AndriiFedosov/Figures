package figures;

import java.text.DecimalFormat;

//create class Triangle and extends for abstract class Figures
public class Triangle extends Figures{


    //create fields of this class
    private double catheter;
    private double base;
    private double hypotenuse;


    //create constructor
    private Triangle(double catheter, double base) {
        this.catheter = catheter;
        this.base = base;
    }

    //create getters and setters
    private double getCatheter() {
        return catheter;
    }

    public void setCatheter(double catheter) {
        this.catheter = catheter;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    private void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    //create void for area of tirange looking
    private double triangleArea(){
        return (catheter*base)/2;
    }


    //crate void for hypotenuse looking
    private double longHypotenuse(double catheter, double base){
        return Math.sqrt(Math.pow(catheter,2)+Math.pow(base,2)) ;
    }

    //create void toString with extending fields
    @Override
    public String toString() {
        return "Фигура: Треугольник, "+ super.toString()+"гипотенуза: "+new DecimalFormat("#0.00").format(hypotenuse) +".";
    }

    //create void who set our object
    public static Object triangleCreate(){

        //create empty object
        Object object = null;

        //crate triangle with random cather and random base
        Triangle triangle = new Triangle((int)(Math.random()*150),(int)(Math.random()*150));

        //set color our figure
        triangle.setColor(colors());

        //reckon our hypotenuse
        triangle.setHypotenuse(triangle.longHypotenuse(triangle.getCatheter(),triangle.getCatheter()));

        //reckon area of figure
        triangle.setArea(triangle.triangleArea());

        //set our object like our figure
        object = triangle;

        //return our object
        return object;
    }
}
