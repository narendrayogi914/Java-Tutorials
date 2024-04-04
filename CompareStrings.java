public class CompareStrings {
    public static void main(String[] args) {
        String s1 = new String("pw");
        String s2 = new String("Skill");
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));


        //concatination strings 
        String n1 = "pwjava";
        String n2 = n1.concat("Skill");
        String n3 = new String("pwjava");
        n3 = n3.concat("Skill");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    } 
}
}

