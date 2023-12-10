package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNFResponse {
    private DataNFResponse data;
    private SupportResponse support;

    public DataNFResponse getData() { return data; }
    public void setData(DataNFResponse value) { this.data = value; }

    public SupportResponse getSupport() { return support; }
    public void setSupport(SupportResponse value) { this.support = value; }
}
