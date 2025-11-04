package _32_LayeredArchitecture2.entity;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class User {
    private Integer userId;
    private String username;
    private String password;
}
