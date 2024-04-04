public class Launch3 {

    public static void main(String[] args) {
        String s1 = "pwskill";
        String s2 = new String("pwskill");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}

