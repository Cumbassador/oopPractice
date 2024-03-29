package exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

//        throw new RuntimeException("My runtime exception.");
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!!! Exception be carefull");
//
//        }
//        try {
//            System.out.println("Begin");
////            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!!! Exception be carefull");
//
//            }
//        finally{
//            System.out.println("Finally");
//
//        }
//        try {
//            throw new RuntimeException();
//        }catch (RuntimeException runtimeException){
//            System.out.println("Runtime exception");
//        }catch (Throwable throwable){
//            System.out.println("Throwable");
//        }
//        Calculator calculator = new Calculator();
//        System.out.println("calculator.division(5,3) = " + calculator.division(5, 3));
//        try {
//            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));
//
//        }catch (CalculatorException ce){
//            System.out.println("Вы ввели что то не то");
//        }


        Person person = new Person("Sergey", 160);
        try {
            person.checkAge();
        } catch (AgeNotValible e) {
            System.out.println("Ошибка!!!");
            e.printStackTrace();

        }


    }
}
