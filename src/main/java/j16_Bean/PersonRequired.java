package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // private final String name;를 초기화하는 생성자 생성
@AllArgsConstructor
public class PersonRequired {
    private final String name;
    private int age;


}
