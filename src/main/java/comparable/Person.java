package comparable;

import lombok.*;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String secondName;
    private final int age;
//    int i = Integer.parseInt(secondName) - Integer.parseInt(o.secondName);
//        if (i == 0) {
//        i = Integer.parseInt(name) - Integer.parseInt(o.name);
//        if (i == 0) {
//            i = age - o.age;
//
//        }
//    }
//
//        return i;

    @Override
    public int compareTo(Person o) {
        int i =secondName.hashCode()-o.secondName.hashCode();
        if (i==0){
            i =name.hashCode()-o.name.hashCode();{
                if(i == 0 ){
                    i = age - o.age;
                }
            }
        }
        return i;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Person;
    }


    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
