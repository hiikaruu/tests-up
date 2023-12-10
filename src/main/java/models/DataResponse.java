package models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataResponse {
    private long id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

}
