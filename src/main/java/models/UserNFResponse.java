package models;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserNFResponse {
    private DataNFResponse data;
    private SupportResponse support;
}
