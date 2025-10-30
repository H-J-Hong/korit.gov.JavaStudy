package _25_LayeredArchitecture.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Todo {
    private int todoId;
    private String contents;
    private User user;                      // 작동 단계에서는 객체로 작동하지만 실제 db에는 userId를 활용해서 접근
    private LocalDateTime createDt;
}
