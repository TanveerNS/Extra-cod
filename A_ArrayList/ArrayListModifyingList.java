import java.util.ArrayList;
import java.util.List;

public class ArrayListModifyingList {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        fillList(items);

        items.set(3, "watch");
        items.add("bowl");
        items.remove(0);
        items.remove("pen");

        for (Object el : items) {

            System.out.println(el);
        }
        
        items.clear();
        
        if (items.isEmpty()) {
            
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }

    public static void fillList(List<String> list) {

        list.add("coin");
        list.add("pen");
        list.add("pencil");
        list.add("clock");
        list.add("book");
        list.add("spectacles");
        list.add("glass");
    }
}