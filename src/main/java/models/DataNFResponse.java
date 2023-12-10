package models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataNFResponse {
    private long id;
    private String name;
    private long year;
    private String color;
    private String pantone_value;

}
