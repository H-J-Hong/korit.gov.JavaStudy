package _25_LayeredArchitecture.entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Todo {
    private int todoId;
    private String contents;
    private User user;                      // 작동 단계에서는 객체로 작동하지만 실제 db에는 userId를 활용해서 접근
    private LocalDateTime createDt;

}
