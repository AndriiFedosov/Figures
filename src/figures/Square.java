package figures;

//Create class Square and extends for Figures
public class Square extends Figures {

    //create field side
    private double side;

    //create constructor
    private Square(double side) {
        this.side = side;
    }
    //create getters and setters
    private double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //create void for area looking
    private double squereArea(double side){
        return Math.pow(side,2);
    }
    //create toString void
    @Override
    public String toString() {
        return "Фигура: Квадрат, "+ super.toString()+"сторона: "+side+".";
    }

    //create void who set our object
    public static Object squareCreate(){

        //create empty object
        Object object=null;

        //crate square  with random side
        Square square = new Square((int)(Math.random()*150));

        //set color our figure
        square.setColor(colors());

        //reckon area of figure
        square.setArea(square.squereArea(square.getSide()));

        //set our object like our figure
        object = square;

        //return our object
        return object;
    }
}
