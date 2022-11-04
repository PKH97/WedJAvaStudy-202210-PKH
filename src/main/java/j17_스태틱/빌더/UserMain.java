package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("user@example.com")
                .username("junil")
                .build();
        System.out.println(user);

        User2 user2 = User2.builder()
                .name("김철수")
                .build();
        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);

    }
}
