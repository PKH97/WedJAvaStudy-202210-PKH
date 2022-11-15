package j25_문자열;

public class String2 {
    public static void main(String[] args) {
        String phoneNumber = "010-1234-5678";

        int firstHyphenIndex = phoneNumber.indexOf("-");
        int lastHyphenIndex = phoneNumber.lastIndexOf("-");
        System.out.println("index: " + lastHyphenIndex);

        String subStringLastNumber = phoneNumber.substring(lastHyphenIndex +1);
        System.out.println("뒷자리: " + subStringLastNumber);

        String subStringMiddleNumber =
                phoneNumber.substring(firstHyphenIndex +1, lastHyphenIndex);
        System.out.println("가운데: " + subStringMiddleNumber);

    }
}
