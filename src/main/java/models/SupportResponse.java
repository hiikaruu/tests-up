package models;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SupportResponse {
    private String url;
    private String text;
}
