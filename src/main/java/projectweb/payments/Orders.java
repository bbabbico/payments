package projectweb.payments;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Orders {

    @Id
    @Column(nullable = false , name = "ordersId")
    private int orderId;    // 주문 ID

    @Column(length = 200 , nullable = false , name = "ordersName")
    private String orderName;  // 주문 이름

    @Column(nullable = false)
    private int totalAmount;   // 총 결제금액

    @Override
    public String toString() {
        return "Order{" +
                "ordersId=" + orderId +
                ", ordersName='" + orderName + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}