package statics;

public class StaticPractice {
    public static void main(String[] args) {
//        System.out.println("Salary.increaseCoefficient = " + Salary.increaseCoefficient);
        Salary cleanerSalary = new Salary(30_000);
        Salary targetSalary = new Salary(42_000);
        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
        Salary.setIncreaseCoefficient(1);
        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
        System.out.println("Salary.CEO_SALARY = " + Salary.CEO_SALARY);
        Car oldCar = new Car("Bmv","Blue");
        Car newCar = new Car("Lada","Yellow");
        oldCar.getCostOfCar();
        newCar.getCostOfCar();
        Figure firstCircle = new Circle(6);
        Figure secondCircle = new Circle(9);
        System.out.println("firstCircle.perimeter() = " + firstCircle.perimeter());
        System.out.println("firstCircle.area() = " + firstCircle.area());
        System.out.println("secondCircle.perimeter() = " + secondCircle.perimeter());
        System.out.println("secondCircle.area() = " + secondCircle.area());


    }
}
