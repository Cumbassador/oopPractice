package iostreams;

import collection.maps.Man;

import java.io.*;
import java.util.Map;

public class SerializationPractice {
    public static void main(String[] args) {
//        Man man= new Man("Vitalick");
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))){
//            outputStream.writeObject(man);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))){
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("man = " + man);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        File user1 = new File("src/main/resources/user.out");
        User user = new User("login1", "123456");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user1"))) {
            outputStream.writeObject(user);
            System.out.println("Object has been serialized: " + user);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/user1"))) {
            User deserialize = (User) inputStream.readObject();
            System.out.println("Object has been deserialized: " + deserialize);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



        }


    }

