enum Result{
    PASS , FAIL , NR;
    //public static final Result Pass = new Result();
    //public static final Result Fail = new Result();
    //public static final Result NR = new Result();
    int marks;
    Result(){
        System.out.println("Constructure in enum");

    }
    void setMarks(int marks){
        this.marks = marks;
    }
    int getMarks(){
        return marks;
    }
}

public class Enum2 {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int m1 = Result.PASS.getMarks();
        System.out.println("Marks for PASS: " + m1);
        int m2 = Result.FAIL.getMarks();
        System.out.println("Marks for Fail: " + m1);
        Result.NR.setMarks(45);
        int m3 = Result.FAIL.getMarks();
        System.out.println("Marks for NR: " + m3);

        
    }
}
