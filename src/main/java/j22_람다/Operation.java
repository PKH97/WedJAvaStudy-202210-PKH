package j22_람다;

@FunctionalInterface
public interface Operation {
    public int calc(int x, int y);
//    public int calc2(int x, int y);
//      -> @FunctionalInterface을 쓰는 이유.
//         두번째 메소드를 만들면 오류를 표시해 주고 인식하기 쉬워진다.

//  람다에 사용하기 위해서는 하나의 추상메소드만 있어야하지만, default는 예외적으로 존재를 허용한다.
    public default String resultToString(int result){
        return "결과: " + result;
    }
}
