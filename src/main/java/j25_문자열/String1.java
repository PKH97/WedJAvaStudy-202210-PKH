package j25_문자열;

public class String1 {
    public static void main(String[] args) {

        String filePath = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study/src/main/java/Integer.java";

        //문제
        /*
        subString() -> 문자열을 잘라준다
        indexOf() -> 내가 찾는 문자열의 위치 인덱스를 반환
         */
        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0, srcIndex);

        String productName = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        String fileName = filePath.substring
                (filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
        String extension = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("프로젝트명: " + productName);
        System.out.println("파일명: " + fileName);
        System.out.println("확장자명: " + extension);



// 내가 작성한 풀이
//        int a = filePath2.indexOf(productName);
//        int b = filePath2.indexOf(fileName);
//        int c = filePath2.indexOf(extension);
//
//        filePath2.substring(a);
//        filePath2.substring(b);
//        filePath2.substring(c);
//
//        System.out.println(productName + "프로젝트명: " + a );
//        System.out.println(fileName + "파일명: " + b );
//        System.out.println(extension + "확장자명: " + c);
//        System.out.println("프로젝트명: " + filePath2.substring(9, 14));
        // -> 안됨

//        String a = "/";
//        int limit = 0;
//
//        String [] array = filePath.split(a, limit);
//
//        for(int i =0; i<array.length; i++){
//            System.out.println(array[i]);
//
//        }
        // -> 활용성 떨어짐

    }
}
