package bitc.full502.team1.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="order_detail")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class OrderDetailEntity {

    @Id
    @Column(name = "order_detail_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderDetailIdx;

    @Column(name = "order_idx_detail")
    private Integer OrderIdx;

    @Column(name = "p_id_detail")
    private Integer ProductId;

    @Column(name = "p_count")
    private Integer OrderDetailProductCount;

    @Column(name = "detail_price")
    private Integer OrderDetailPrice;

    @Column(name = "order_color")
    private String OrderDetailColor;

    @Column(name = "order_size")
    private String OrderDetailSize;

    @ManyToOne
    @JoinColumn(name = "order_idx_detail")
    private OrderEntity order;
}
