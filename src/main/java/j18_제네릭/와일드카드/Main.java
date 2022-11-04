package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag) {

        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
//        }else if (flag == 3) {
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("K8"));
//            return animalData;  -> <? extends Animal>는 Animal을 상속받은 클래스들만 사용가능하게 제한을 거는것.
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getAnimal(3));
    }
}
