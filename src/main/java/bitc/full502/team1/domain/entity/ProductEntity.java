package bitc.full502.team1.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class ProductEntity {

    @Id
    @Column(name = "p_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 데이터베이스에서 자동 증가는 아니지만, 자동으로 들어가줘야하기 때문에 위 어노테이션 넣었습니다!
    private int ProductId;

    @Column(name = "p_price")
    private int ProductPrice;

    @Column(name = "p_name")
    private String ProductName;

    @Column(name = "p_code")
    private String ProductCode;

    @Column(name = "p_brand")
    private String ProductBrand;

    @Column(name = "p_thumnail")
    private String ProductThumnail;

    @Column(name = "p_color")
    private String ProductColor;

    @Column(name = "p_size")
    private String ProductSize;
}
