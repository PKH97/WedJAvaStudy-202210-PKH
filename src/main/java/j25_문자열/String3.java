package j25_문자열;

public class String3 {
    public static void main(String[] args) {

        String phoneNumber = "010 1234/5678";

        String replacePhoneNumber = // .replaceFirst();-> 앞에서부터
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/", "")
                        .replaceAll("_", "")
                        .replaceAll(" ", "");
        System.out.println(replacePhoneNumber);

    }
}
