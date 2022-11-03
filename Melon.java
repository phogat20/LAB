import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Melon {
    private static String type;
    private int weight;

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Melon.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Melon(String type, int weight) {
        this.type=type;
        this.weight=weight;
    }
    
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        List<String> melonsByType = Arrays.asList("Apollo", "Gac", "Crenshaw", "Hami");

        List filter = 
        melons.stream().filter(m->melonsByType.contains(melons)).collect(Collectors.toList());
        System.out.println(filter);
        
        

    }
}
