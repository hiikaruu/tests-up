package models;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {
    private String email;
    private String password;

}
