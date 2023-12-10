package models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsersNFResponse {
    private long page;
    private long per_page;
    private long total;
    private long total_pages;
    private DataNFResponse[] data;
    private SupportResponse support;

}
