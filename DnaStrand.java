import java.util.ArrayList;
public class DnaStrand {
    public static String makeComplement(String dna) {
        String[] dnaArray = dna.split("");
        ArrayList<String> dnaList = new ArrayList<String>();
        for (String s : dnaArray) {
            if (s.equals("A")) {
                dnaList.add("T");
            } else if (s.equals("T")) {
                dnaList.add("A");
            } else if (s.equals("C")) {
                dnaList.add("G");
            } else if (s.equals("G")) {
                dnaList.add("C");
            }
        }
        return String.join("", dnaList);
    }
  }