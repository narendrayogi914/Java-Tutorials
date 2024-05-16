import java.util.ArrayList;



public class CollectionAndMapApi {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        ArrayList al2 = new ArrayList();
        al2.add("Narendra");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);
        al2.addAll(al1);
        System.out.println("After Adding Collection ");
        System.out.println(al2);
        al2.add(2, "ram");
        System.out.println("Adding Element at Specific Index ");
        System.out.println(al2);



        ArrayList al4 = new ArrayList();
        al2.add(3, "Jai Shree Ram");
        al4.addAll(al2);
        System.out.println(al4);



        
    }
}
