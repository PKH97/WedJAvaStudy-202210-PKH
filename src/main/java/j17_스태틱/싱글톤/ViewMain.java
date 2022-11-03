package j17_스태틱.싱글톤;

public class ViewMain {
    public static void main(String[] args) {
        ProductView productView = ProductView.getInstance();
        productView.showMainView();
        productView.showOrderView();
//      위아래 같은 방식
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();
    }
}
