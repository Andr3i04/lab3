import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static <Set> void main(String[] args) {
        /*
        List<Integer> list=new ArrayList<>();
        Random random=new Random();

        for(int i=0; i<15; i++) {
            list.add(random.nextInt(100));
        }

        for(int i=0; i<15; i++) {
            System.out.println(list.get(i));
        }
        */
         HashSet <String> hashSet = new HashSet<>();

         hashSet.add("TEST1");
         hashSet.add("TEST2");

         System.out.println(hashSet);

    }
}