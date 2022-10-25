package j07_반복;

public class Loop1 {
    public static void main(String[] args) {

        int result = 0;
        /*
        반복을 해라. i가 0부터 100이 되기 전까지 i를 1씩 증가시키면서 반복해라.
         -> for (int i = 0; i < 100; i++)
         */

        for (int i = 0; i < 100; i++){
            /*
               int i = 0:는 i를 0을 대입해 리셋
               0이된 i를 100과 비교
               밑으로 내려가 조건을 대응
               다시 위로 올라와 처음으로 돌아가면서 i가 증가하게된다.
               < 100의 조건을 넘게되면 반복문이 종료된다.
            */
            result += i + 1 ;
        }

        System.out.println("1 ~ 100까지 더한 값: " + result);


    }
}
