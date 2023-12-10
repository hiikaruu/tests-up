package models;
import java.util.Date;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserChangedResponse {
    private String name;
    private String job;
    private String id;
    private Date createdAt;
    private Date updatedAt;
}
