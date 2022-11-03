package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

import java.nio.file.Path;

@Getter
@Setter
public class ProductMain {
    private String name;

    public static void main(String[] args) {
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);

        System.out.println(Product.autoIncrement);

        Product.autoIncrement++;
        System.out.println(Product.autoIncrement);

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        // -> 20220002 => 위에서 1증가되었고 생성자에서 1증가되었기에 결과값이 2이다.

        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        Product p5 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        System.out.println(p2.getAutoIncrement());
        System.out.println(p3.getAutoIncrement());
        System.out.println(p4.getAutoIncrement());
        System.out.println(p5.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());


        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();

        ProductMain productMain = new ProductMain();
        productMain.setName("테스트");
        System.out.println(productMain.getName());

        Method1.main(new String[]{});
        Method1.call1();
    }
}
/*
            Q.아래가 출력되도록 만들어라.

            1. serialNumber = 20220001, productName = "스타벅스 블랙 텀블러1"
            2. serialNumber = 20220002, productName = "스타벅스 블랙 텀블러2"
            3. serialNumber = 20220003, productName = "스타벅스 블랙 텀블러3"
            4. serialNumber = 20220004, productName = "스타벅스 블랙 텀블러4"
            5. serialNumber = 20220005, productName = "스타벅스 블랙 텀블러5"

//        Product[] products = new Product[5];
//        for(int i = 0; i < products.length; i++) {
//            products[i] = new Product("스타벅스 블랙 텀블러" + (i+1));
//        }

        Product[] products = new Product[5];

        products[0] = new Product("스타벅스 블랙 텀블러1");
        products[1] = new Product("스타벅스 블랙 텀블러2");
        products[2] = new Product("스타벅스 블랙 텀블러3");
        products[3] = new Product("스타벅스 블랙 텀블러4");
        products[4] = new Product("스타벅스 블랙 텀블러5");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
*/