package statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle extends Figure{
    private double radius;
    private final static double PI = 3.14;
    @Override
    public  double perimeter(){

        return 2*PI*radius;
    }

    @Override
    void quantityOfAngles() {
        System.out.println("Don't have angles ");
    }

    @Override
    public double area(){

        return  2*PI*radius*radius;
    }
}


