package j17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung {
    @Getter
    private String company; // company에만 getter생성됨
    private int serialNumber;

    private static Samsung instance = null;

    // 외부에서 들어오지 못하게 하기위해 private을 사용.
    private Samsung() {
        company = getClass().getSimpleName(); // 본인의 클래스명 가저오는 코드
        serialNumber = 20220000; // 첫 생성될때 번호
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model +"_" + ++serialNumber;
    }

}
