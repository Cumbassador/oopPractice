package statics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;


@AllArgsConstructor
public class Salary {
    private double baseSalary;
    public final static double CEO_SALARY = 500_000;
    @Setter
    private static double increaseCoefficient = 2.5;

    public  double getFullSalary(){
        return baseSalary*increaseCoefficient;
    }

}
