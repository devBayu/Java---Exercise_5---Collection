import com.enigma.model.Number;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();

        number.add(10);
        number.add(5);
        number.add(1);
        number.add(1);
        number.add(1);
        number.add(3);
        number.add(4);

        for (Integer value:number){
            System.out.println(value);
        }

    }
}
