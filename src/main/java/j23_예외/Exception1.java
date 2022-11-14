package j23_예외;

public class Exception1 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2 ,3, 4, 5, 6, 7};

        try {
            String a = null;
            a.toLowerCase(); //-> null안에 존재하지 않는 것을 넣으면 오류가 발생.

            for (int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }catch (NullPointerException e) {
            System.out.println("null pointer to exception");
        }finally {
            System.out.println("항상 실행되어야 하는 서비스");
        }
        System.out.println("프로그램 정상 종료");

    }
}
/*
ArrayIndexOutOfBoundsException -> 예외처리를 해준다.
NullPointerException -> 해당 변수에 null이 들어있는경우 사용
    이 두가지를 동시에 사용해야 한느 경우에는 catch를 이용해서 같이 사용할 수 있다.
    catch는 if의 사용과 비슷하다.
 */
