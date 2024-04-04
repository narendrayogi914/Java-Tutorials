public class MutableString {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Narendra ");
        System.out.println(sb);
        // StringBuffer str = "narendra";// invalid case 
        sb.append("Yogi");
        System.out.println(sb);
        StringBuilder  stb = new StringBuilder("Rahul");
        System.out.println(stb);
        stb.insert(5, " is a good boy");
        System.out.println(stb);
        stb.delete(4, 8);
        System.out.println(stb);
        


    }
}
