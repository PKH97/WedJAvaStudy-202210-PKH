package j14_참조자료형캐스팅.동물;

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for(int i=0; i<animals.length; i++){
            animals[i].move();
        }

        for (int i=0; i<animals.length; i++){
            if(animals[i] instanceof Human){
//                Human h = (Human)animals[i];
//                h.readBooks();
//                위아래 같다.
                ((Human) animals[i]).readBooks();
//      -> 묶어주지 않으면 animals[i]의 우선도가 높기 때문에 오류가 생긴다.
            }else if(animals[i] instanceof Tiger){
                ((Tiger) animals[i]).hunting();
            }
        }
    }
}
