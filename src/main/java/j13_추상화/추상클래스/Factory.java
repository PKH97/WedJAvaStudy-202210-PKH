package j13_추상화.추상클래스;

/*
[ abstract :추상클래스 ]
1. 추상 메소드가 하나라도 포함되면 해당 클래스는
   추상클래스로 정의되어야한다.
2. 추상 클래스는 생성할 수 없다.
3. 그외의 다른 특징은 일반클래스와 동일
 */
public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model);
    public abstract void management();

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름: " + name);
    }
}
/*
확장: 추상이든 일반클래스든 무조건 1:n의 관계이다.(n:n의 관계 x)
     상속관계는 다른 클래스를 추가로 확장 X
 */