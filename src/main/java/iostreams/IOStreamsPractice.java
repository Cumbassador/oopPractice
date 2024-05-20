package iostreams;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class IOStreamsPractice {
    public static void main(String[] args) {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш inout равен: " + input);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        }

        //try with resources

//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));) {
//            String input = console.readLine();
//            System.out.println("Ваш inout равен: " + input);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        File file = new File("src/main/resources/file.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("Строка1");
            printWriter.println("Строка2");
            printWriter.println("Строка3");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)){
            printWriter.println("Привет это первый файл из которого нужно перенести текст во второй файл");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (PrintWriter printWriter = new PrintWriter(file2)){
            printWriter.println("Привет это второй файл из которого нужно перадать в file1");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            // Чтение содержимого файлов
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            StringBuilder content1 = new StringBuilder();
            String line;
            while ((line = reader1.readLine()) != null) {
                content1.append(line).append("n");
            }
            reader1.close();

            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            StringBuilder content2 = new StringBuilder();
            while ((line = reader2.readLine()) != null) {
                content2.append(line).append("n");
            }
            reader2.close();

            // Обмен содержимым файлов
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
            writer1.write(content2.toString());
            writer1.close();

            BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));
            writer2.write(content1.toString());
            writer2.close();

            System.out.println("Содержимое файлов успешно поменяно местами.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }



    }
}