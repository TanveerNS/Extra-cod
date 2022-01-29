import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveIf {

    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(-3);
        values.add(2);
        values.add(8);
        values.add(-2);
        values.add(6);

        values.removeIf(val -> val < 0);
        
        System.out.println(values);
    }
}