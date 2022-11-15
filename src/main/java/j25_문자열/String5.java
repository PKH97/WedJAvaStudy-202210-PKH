package j25_문자열;

public class String5 {
    public static void main(String[] args) {
        java.lang.String httpMethod = "Get";

        if(httpMethod.toLowerCase().equals("gET")){
            System.out.println("get요청입니다.");
        }else{
            System.out.println("get요청이아닙니다.");
        }
    }
}
