import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(100);
        a1.add(50);
        a1.add(150);
        a1.add(25);
        a1.add(75);
        a1.add(125);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
        Collections.rotate(a1, 3);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("A");
        al2.add("Narendra");
        al2.add("Kumar");
        //al2.add(5);//complie time error 
        System.out.println(al2);


    }
}
