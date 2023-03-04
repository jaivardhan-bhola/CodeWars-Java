import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> list = new ArrayList<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    list.add(s1);
                    break;
                }
            }
        }
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}