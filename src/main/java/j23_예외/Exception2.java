package j23_예외;

public class Exception2 {
    public static void printArray(int[] numbers) throws Exception {
        for (int i = 0; i < numbers.length + 1; i++) {
            System.out.println("/" + numbers[i]);
        }
    }

    public static void main (String[] args){
        if(1 == 1) {
            try {
                throw new RuntimeException("예외 강제 생성");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("런타임 예외 처리");
            }catch (Exception e){//웬만한 모든 오류를 처리해 줄 수 있다. 마지막에 사용.
                e.printStackTrace();
            }finally { // -> 반드시 실행된다. 오류를 확인하기 위해 사용됨.
                System.out.println("예외가 발생 하든 하지 않든 실행");
            }
        }
        System.out.println("프로그램 정상 종료");

//        try {
//            printArray(new int[]{1, 2, 3, 4, 5, 6, 7});
//        } catch (Exception e) {
//            throw new RuntimeException(e); //-> 예외를 강제로 생성,실행 해준다
//        }

    }
}

/* 내가 만든 로직
public static void main(String[] args) {
printArray(new int[] {1, 2, 3, 4, 5, 6, 7});
try{
   printArray(new int[] {1, 2, 3, 4, 5, 6, 7});
 }catch (ArrayIndexOutOfBoundsException e){
   System.out.println("예외처리되었습니다.");
 }
   System.out.println("프로그램 정상 종료");

    //정답
        try{
        for(int i = 0; i < numbers.length + 1; i++){
            System.out.println("/" + numbers[i]);
        }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace(); // 오류를 출력해주고, 정상출력을 해준다.
        }
    }
 */
/*
throws -> 예외처리해줌, 본인을 호출해준 곳으로 넘긴다.

예외처리는 오류를 잡아내는 일을 한다.
보통 스마트폰에서 사전에 수집하는 정보동의서가 예외처리에
사용되어 오류를 수집해 수정에 사용된다.
 */
