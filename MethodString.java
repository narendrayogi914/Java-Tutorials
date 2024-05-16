public class MethodString {
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

        final StringBuffer st = new StringBuffer("Vikash");
        st.append("Kohli");
        System.out.println(st);
        // st = new StringBuffer("Sachin");//now allow  to change the value of object because it is mutable
        System.out.println(st);



        StringBuffer n = new StringBuffer();
        System.out.println(n.capacity());
        n.append("abcdefghijklmnopqrstuvw");
        System.out.println(n.capacity()); // changes the capacity like  new capicity = (current capicity  + 1)*2;
        System.out.println(n.length()); // How many characters arae presemt  in buffer?

        StringBuffer sb2 = new StringBuffer("Ram");
        System.out.println(sb2);
        
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(2));
        System.out.println(sb2.setCharAt("m", 2));



 
    }
}
