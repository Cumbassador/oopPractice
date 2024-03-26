package interfaces;

public class BadGin implements Creatable {
    @Override
    public void createWish() {
        System.out.println("Плохи исполнил жедание");
    }
    public  void canYouCreateWish(){
        System.out.println("Я не исполняю желаний");
    }
}
