package interfaces;

public class Cow implements Eatable,Talkable {
    public void eat(){
        System.out.println("Cow can eat");
    }
    public void talk(){
        System.out.println("Cow can't talk");
    }
}
