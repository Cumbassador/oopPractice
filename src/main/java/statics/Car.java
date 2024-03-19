package statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String brand;
    private String color;
    private static  double cost = 300_000;

    public  void getCostOfCar() {
        System.out.println("{ " + brand +" "+   color +" "+ cost + " }");
    }
}


