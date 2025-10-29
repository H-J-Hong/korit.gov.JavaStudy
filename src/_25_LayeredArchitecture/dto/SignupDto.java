package _25_LayeredArchitecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class SignupDto {
    private String username;
    private String password;
    private String name;
}
