package j07_반복;

public class Loop6 {
    public static void main(String[] args) {

        int n = 5;

        // 일정한 순서를 가지고 순차적으로 증가시킬때 사용
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }

        int i = 0;

        // 해당조건이 되었을때 멈춰라 같은 조건이 있을때 사용
        while (i < n){
            System.out.println(i + 1);
            i++;
        }


    }
}
