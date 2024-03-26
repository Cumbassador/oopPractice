package interfaces;

public class Plant implements Talkable,Eatable {
    public void talk(){
        System.out.println("Plant can't talk");
    }
    public void eat(){
        System.out.println("Plant cant eat");
    }
}
