package figures;

//create class circle and extends for Figures
public class Circle extends Figures {
    //create field of class
    private double radius;

    //create constructor
    private Circle(double radius) {
        this.radius = radius;
    }

    //create getters and setters
    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //reckon area of figure
    private double circleArea(double radius){
        return Math.PI+Math.pow(radius,2);
    };

    //create toString void
    @Override
    public String toString() {
        return "Фигура: Круг, "+ super.toString()+"радиуc: "+radius+".";
    }

    //create void who set our object
    public static Object circleCreate(){

        //create empty object
        Object object=null;

        //crate circle  with random radius
        Circle circle = new Circle((int)(Math.random()*150));

        //set color our figure
        circle.setColor(colors());

        //reckon area of figure
        circle.setArea(circle.circleArea(circle.getRadius()));

        //set our object like our figure
        object=circle;

        //return our object
        return object;
    }
}
