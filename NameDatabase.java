import java.util.*;

public class NameDatabase {

    public static HashMap<String, Integer> nameFreq = new HashMap<>();

    static HashMap<String, Integer> NameDatabase(List<String> names){

        for(int i=0; i<names.size(); i++){
            if(nameFreq.containsKey(names.get(i))){
                int temp = nameFreq.get(names.get(i)) + 1;
                nameFreq.replace(names.get(i), temp);
            } else{
            nameFreq.put(names.get(i), 1);
            }
        }

        return nameFreq;

    }

    static void printFrequencies(HashMap<String, Integer> table) {

        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }

    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Bp");
        names.add("Bp");
        names.add("cat");
        names.add("Goku");
        names.add("Goku");
        printFrequencies(NameDatabase(names));
        
    }

}
