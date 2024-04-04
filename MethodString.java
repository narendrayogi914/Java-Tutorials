-+public class MethodString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str); // Hello World
        // convert into uppercase 
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(6, 11));
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));



        // Final Keyword
        final int a = 20;
        // a = 20; not allow 
        System.out.println(a);




    }
}
