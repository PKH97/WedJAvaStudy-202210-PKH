package j17_스태틱.싱글톤; // 싱글톤: 객체 1개만 생성

public class ProductView {
    /*---------- ※ 싱글톤 공식 ※ -----------*/
    private static ProductView instance = null;

    private ProductView(){}

    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    } // => 계속 같은 주소값을 돌려줌
    /*---------- ※ 싱글톤 공식 ※ -----------*/

    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}
