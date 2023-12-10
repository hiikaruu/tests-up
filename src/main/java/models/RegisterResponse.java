package models;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterResponse {
    private long id;
    private String token;
    private String error;
}
