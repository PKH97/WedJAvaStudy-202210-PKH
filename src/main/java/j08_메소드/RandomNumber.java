package j08_메소드;

import java.util.Random;

public class RandomNumber {
    public static int calcRandom(int m) {
        //리턴을 사용할 때 함수는 고정(다른 함수 사용x)
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return result;
    }
        public static void main(String[] args) {

        //Random random = new Random();

        int money = 5000;

      /*int a = random.nextInt(10) * 1000 + money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000 + money;
        System.out.println(b);
        int c = random.nextInt(10) * 1000 + money;
        System.out.println(c);
        int d = random.nextInt(10) * 1000 + money;
        System.out.println(d);

        // 수식이 복잡해질 수 록 중복-반복하는걸 줄여야한다.

        /* for(int i = 0; i < 10; i++){
            int randNum = random.nextInt(100) + 100;
            System.out.println(randNum);
        }*/

         System.out.println(calcRandom(money));
         System.out.println(calcRandom(money));
         System.out.println(calcRandom(money));
         System.out.println(calcRandom(money));
         System.out.println(calcRandom(money));
         System.out.println(calcRandom(money));
         System.out.println(calcRandom(money));

         System.out.println("<<<<<<<<<<-------->>>>>>>>>>");

         int r = calcRandom(money);
         System.out.println(r + 100);
         System.out.println(r + 1000);
         System.out.println(r + 10000);
         System.out.println(r + 100000);

    }
}

