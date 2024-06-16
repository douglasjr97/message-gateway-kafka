package br.com.nerak.api_payment.entity;

import br.com.nerak.api_payment.entity.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class PaymentSlipEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bar code")
    private String barCode;

    @Column(name = "status payment")
    private PaymentStatus paymentStatus;

    @Column(name = "creation Date")
    private LocalDateTime createdAt;

    @Column(name = "updateDate")
    private LocalDateTime updatedAt;

}
