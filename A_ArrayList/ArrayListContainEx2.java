import java.util.ArrayList;
import java.util.List;

public class ArrayListContainEx2 {

    public static void main(String[] args) {
        
        List<String> items = new ArrayList<>();
        
        items.add("coin");
        items.add("pen");
        items.add("cup");
        items.add("notebook");
        items.add("class");
        
        String item = "pen";
        
        if (items.contains(item)) {
            
            System.out.printf("There is a %s in the list%n", item);
        }
    }
}