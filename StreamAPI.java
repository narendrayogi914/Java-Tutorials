import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list  =  Arrays.asList(44,5,22,8,9);
        Stream<Integer> streamData =  list.stream();
        // using anonymous inner class ------>
        // Predicate<Integer> pre = new Predicate<Integer>() {
        //     public boolean test(Integer i){
        //         if (i%2==0) {
        //             return true;
        //         }
        //         else
        //             return false;
        //     }
        // };

        Predicate<Integer> pre = i->i%2==0; //using lambda Expression  
        Stream<Integer> FinalStream =  streamData.
        filter(pre)
        .sorted()
        .map(n->n*2);
        // Stream<Integer> sortedStream =  filterData.sorted();
        // Stream<Integer> mapStream =  sortedStream.map(n->n*2);
        
        FinalStream.forEach(n->System.out.println(n));
        
        
        // filterData.forEach(n->System.out.println(n));

        // sortedStream.forEach(System.out::println);
        // long count = streamData.count();
        // System.out.println(count);
        // streamData.forEach(i->System.out.println(i));

    }
}
