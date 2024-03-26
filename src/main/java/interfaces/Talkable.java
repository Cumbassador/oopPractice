package interfaces;

public interface Talkable {
    default void talk(){
        System.out.println("to talk");

    }
}
