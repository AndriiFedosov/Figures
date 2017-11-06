package figures;

//create class trapezium and extends for Figures
public class Trapezium extends Figures{
        //create fields
        private double centerLine;
        private double height;

        //create constructor
    private Trapezium(double centerLine, double hight) {
        this.centerLine= centerLine;
        this.height = hight;
    }

    //create getters and setters


    private double getCenterLine() {
        return centerLine;
    }

    public void setCenterLine(double centerLine) {
        this.centerLine = centerLine;
    }

    private double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //reckon area of our figure
    private double areaTrapezium(double baseLine, double hight){
        return baseLine*hight;
    }
    //create void toString
    @Override
    public String toString() {
        return "Фигура: Трапеция, "+ super.toString()+",средняя линия :"+centerLine+ ", высота: "+ height+".";
    }

    //create void who set our object
    public static Object trapeziumCreate(){

        //create empty object
        Object object = null;

        //crate trapezium with random hight and random center line
        Trapezium trapezium =  new Trapezium((int)(Math.random()*150),(int)(Math.random()*150));

        //chose color of our figure
        trapezium.setColor(colors());

        //reckon area of figure
        trapezium.setArea(trapezium.areaTrapezium(trapezium.getCenterLine(),trapezium.getHeight()));

        //set object our figure
        object = trapezium;

        //return our figure
        return object;
    }
}
