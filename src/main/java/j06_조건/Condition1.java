package j06_조건;

public class Condition1 {
    public static void main(String[] args) {
        int num = -10;

        // num>0 말고 ture, flase가 들어갈 수 있다.
        if(num > 0 || num == 0){
            System.out.println("num이 0이거나 num은 양수입니다.");
        }else{
            System.out.println("num은 음수입니다.");
        }

        if(num < 0){
            System.out.println("num은 음수입니다.");
        }

    }

}
