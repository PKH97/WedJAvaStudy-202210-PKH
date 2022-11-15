package j25_문자열;

public class String6 {
    public static void main(String[] args) {
        String httpRequest = " ";
        /*
            문자열이 비어있지 않으면?
            1. null -> X
            2. "" -> X
            3.
         */

        if(httpRequest.isBlank()) { // -> 띄어쓰기를 공백으로 보지 않는다.
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }

    }
}
