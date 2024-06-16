package br.com.nerak.apipayment.entity;

import br.com.nerak.apipayment.entity.enums.InvoiceStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bar code")
    private String barCode;

    @Column(name = "status payment")
    private InvoiceStatus invoiceStatus;

    @Column(name = "creation Date")
    private LocalDateTime createdAt;

    @Column(name = "updateDate")
    private LocalDateTime updatedAt;

}
