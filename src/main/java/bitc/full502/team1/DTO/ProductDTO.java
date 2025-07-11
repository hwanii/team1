package bitc.full502.team1.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductDTO {

    private int productId;
    private int productPrice;
    private String productName;
    private String productCode;
    private String productBrand;
    private String productThumnail;
    private String productColor;
    private String productSize;
}
