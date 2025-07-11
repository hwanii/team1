package bitc.full502.team1.DTO;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Data
public class CustomerDTO {

    private int customerIdx;
    private String customerId;
    private String customerPass;
    private String customerName;
    private String customerAddr;
    private String customerEmail;
    private String customerPhone;
    private int customerPoint;
    private String customerCoupon_yn;
}
