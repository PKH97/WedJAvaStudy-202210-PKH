package j11_배열;

public class ArrayTest1 {

    public static void main(String[] args) {
        int[] numArray = new int[10]; // new는 새 메모리 생성. [10]은 10개의 공간을 생성하라.

        int index = 9;
        numArray[index] = 10;
        //index라는 변수안의 아홉번째 자리에 10이라는 값을 넣은것.

        for(int i = 0; i < 10; i++) {
            System.out.println(numArray[i]);
        }

         /*
        = new int[10]는 4바이트의 공간이 10개를 묶어서 생성해라.
        각 공간은 각자의 주소가 있다.
        같은 변수명을 작성하여 값을 넣는다.
         */
    }

}
