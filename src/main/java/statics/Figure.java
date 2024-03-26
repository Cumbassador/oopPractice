package statics;

abstract class Figure {
    private final static double PI = 3.14;
    abstract void quantityOfAngles();
        public double area(){
            System.out.println("Необходимо переопределить этот метод в дочернем классе.Так же нельзя создавать обьекты класса фигуры.");
            return  0;
        }
        public  double perimeter(){
            System.out.println("Необходимо переопределить этот метод в дочернем классе.Так же нельзя создавать обьекты класса фигуры.");
            return 0;
        }

}
