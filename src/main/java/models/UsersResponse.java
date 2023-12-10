package models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsersResponse {
    private long page;
    private long per_page;
    private long total;
    private long total_pages;
    private DataResponse[] data;
    private SupportResponse support;
}
