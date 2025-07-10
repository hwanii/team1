package bitc.full502.team1.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OrderDetailDTO {

    private Integer orderDetailIdx;
    private Integer orderIdx;
    private Integer oroductId;
    private Integer orderDetailProductCount;
    private Integer orderDetailPrice;
    private String orderDetailColor;
    private String orderDetailSize;
}
