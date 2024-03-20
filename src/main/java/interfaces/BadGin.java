package interfaces;

public class BadGin implements Creatable {
    @Override
    public void createWish() {
        System.out.println("Плохи исполнил жедание");
    }
}
