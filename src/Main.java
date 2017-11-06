
//import classes what we need
import figures.Circle;
import figures.Square;
import figures.Trapezium;
import figures.Triangle;

import java.io.UnsupportedEncodingException;


//create point input of our program
public class Main {
    //create void main
    public static void main(String[] args) throws UnsupportedEncodingException {

        //create  figurarray  with random length 1 to 50
        Object[]figures = new Object[(int)(Math.random()*50)];

        ///create loop and add object in array
        for(int i=0;i<=figures.length-1; i++){
            //create number of figure that we create
            int j = (int)(Math.random()*4);

            //create empty object
            Object object = null;

            // change object
            switch (j){
                //create circle with parameters
                case 0: object = Circle.circleCreate();
                        break;
                //create square with parameters
                case 1 : object = Square.squareCreate();
                        break;
                //create triangle with parameters
                case 2 : object = Triangle.triangleCreate();
                        break;
                //create trapezium with parameters
                case 3 : object = Trapezium.trapeziumCreate();
                        break;
            }
            //add our object into array box
            figures[i] = object;
            //set endcoding of our text
            String s = new String (String.valueOf(figures[i].toString()).getBytes(),"UTF-8");
            //show our object
            System.out.println(s);


        }
    }
}
