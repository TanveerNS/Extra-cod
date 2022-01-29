import java.util.ArrayList;
import java.util.List;

class Base {}

enum Level {
    
    EASY,
    MEDIUM,
    HARD
}

public class ArraylListVarousDataTypes {

    public static void main(String[] args) {

        Level level = Level.EASY;
        
        List da = new ArrayList();
        
        da.add("Java");
        da.add(3.5);
        da.add(55);
        da.add(new Base());
        da.add(level);

        for (Object el : da) {

            System.out.println(el);
        }
    }

}