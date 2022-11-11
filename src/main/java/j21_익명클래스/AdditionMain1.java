package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args){
        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        //임시클래스를 호출, 정의해 즉시생성. 주소만 있는상태. 재사용 x. 클랙스의 이름이 없는 익명클래스. 추상클래스도 생성가능하다.
        Addition<Integer> integerAddition = new Addition<Integer>() {
            @Override
            public Integer add(Integer values) {

                return null;
            }
        };

    }
}
