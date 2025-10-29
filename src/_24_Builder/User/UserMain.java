package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user1 = User.builder()
                .userId(1)
                .username("ghdgowns")
                .password("q1w2e3r4")
                .email("ghdgowns@gmail.com")
                .build();
        System.out.println(user1.toString());

        User user2 = User.builder()
                .userId(2)
                .email("aaa$aaa.com")
                .build();
        System.out.println(user2.toString());
    }
}
