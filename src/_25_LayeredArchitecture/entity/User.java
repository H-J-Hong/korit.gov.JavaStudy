package _25_LayeredArchitecture.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {
    private int userId;
    private String username;
    private String password;
    private String name;
}
