package j17_스태틱;
//스태틱(static): 공유영역

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 20220000;

    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement; // 1씩 생성될때마다 값이 1씩 증가
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo(){
//        System.out.println(productName);  -> 멤버변수는 스태틱 메소드에서 사용할 수 없다.
        Product product = new Product("product");
        System.out.println(product.productName); // -> but, 자기자신을 생성하면 사용가능

        System.out.println(autoIncrement);
    }
}
