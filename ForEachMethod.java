import java.util.*;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(4);
        // list.add(5);
        // list.add(8);
        // list.add(9);
        // System.out.println(list);


        List<Integer> list2 = Arrays.asList(2,4,5,8,9);
        System.out.println(list2);
        // for(int i : list2){
        //     System.out.println(i);
        // }
        Consumer<Integer> cons = n->System.out.println(n);

        list2.forEach(cons);


    }
}
