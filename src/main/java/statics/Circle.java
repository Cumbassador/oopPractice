package statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle extends Figure{
    private double radius;
    private final static double PI = 3.14;
    public  double perimeter(){

        return 2*PI*radius;
    }
    public double area(){

        return  2*PI*radius*radius;
    }
}


