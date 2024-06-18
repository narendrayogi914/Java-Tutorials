enum Result
{
    PASS , FAIL , NR;
}

public class EnumSwitchCase {
    public static void main(String[] args) {
       Result res = Result.PASS; 
       switch(res){
        case PASS :System.out.println("Passed");
        break;
        case FAIL : System.out.println("Fail");
        break;
        case NR : System.out.println("Not Result");
        
       }
    }
}
