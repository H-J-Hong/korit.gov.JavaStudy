package _25_LayeredArchitecture.entity;

import lombok.*;

@AllArgsConstructor
@ToString                       // 디버깅용, 실제 서비스 단계에서는 사용하지 않음.
@Getter
@Setter
@Builder

public class User {
    private int userId;
    private String username;
    private String password;
    private String name;
}
