import com.enigma.model.Number;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Number> number = new HashSet<>();

        number.add(new Number(10));
        number.add(new Number(5));
        number.add(new Number(1));
        number.add(new Number(1));
        number.add(new Number(1));
        number.add(new Number(3));
        number.add(new Number(4));

        for (Number value: number){
            System.out.println(value.getNumb());
        }

    }
}
