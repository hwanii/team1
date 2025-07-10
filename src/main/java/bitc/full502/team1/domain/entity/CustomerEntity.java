package bitc.full502.team1.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class CustomerEntity {

    //    private int CustomerIdx;
//    @Column(unique=true)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Customeridx;
    @Column(name = "user_id")
    private String CustomerId;
    @Column(name = "pass", length = 500)
    private String CustomerPass;
    @Column(name = "c_name" , length = 500)
    private String CustomerName;
    @Column(name = "addr" , length = 500)
    private String CustomerAddr;
    @Column(name = "email" , length = 500)
    private String CustomerEmail;
    @Column(name = "phone" , length = 500)
    private String CustomerPhone;
    @Column(name = "point")
    private int CustomerPoint;
    @Column(name = "coupon_yn", length = 50)
    private String CustomerCoupon_yn;



//    다른 entity 만들지 않아 릴레이션은 따로 적지 않았습니다 entity 추가되면서 하나씩 수정하겠습니다.

}
