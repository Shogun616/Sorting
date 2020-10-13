import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        int b = "Metro 2033".compareTo("Dracula");
        System.out.println(b);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(99);
        numbers.add(2);

        numbers.sort(null);

        for (Integer num : numbers){
            System.out.println(num);
        }
    }
}
