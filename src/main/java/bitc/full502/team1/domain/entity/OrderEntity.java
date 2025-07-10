package bitc.full502.team1.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class OrderEntity {

    @Id
    @Column(name = "order_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderIdx;

    @Column(name = "p_count")
    private Integer OrderProductCount;

    @CreatedDate
    @Column(name = "order_date")
    private LocalDateTime OrderDate;

    @Column(name = "p_id_order")
    private Integer ProductId;

    @Column(name = "c_id_order")
    private Integer CustomerId;

    @Column(name = "total_price")
    private Integer OrderTotalPrice;

    @Column(name = "res_price")
    private Integer OrderResPrice;
}
