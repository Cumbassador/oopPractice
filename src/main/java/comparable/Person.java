package comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person> {
    private final String name;
    private final String secondName;
    private final int age;


    @Override
    public int compareTo(Person o) {

        return ;
    }
}
