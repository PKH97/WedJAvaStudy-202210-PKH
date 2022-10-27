package j10_접근지정자;

import j10_접근지정자.StudentAccessModifier;

public class AccessModifierMain {
    public static void main(String[] args) {
        
        StudentAccessModifier sam = new StudentAccessModifier(20220001, "김준일");

        sam.showInfo();
        sam.setName("김준이"); //-> set 사용으로 내용 변경
        sam.showInfo();

        System.out.println(sam.getCode());
        
    }
    
}
