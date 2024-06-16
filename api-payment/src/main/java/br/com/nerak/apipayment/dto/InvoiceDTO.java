package br.com.nerak.apipayment.dto;
import br.com.nerak.apipayment.entity.enums.InvoiceStatus;
import lombok.*;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceDTO {
    private String barCode;
    private InvoiceStatus invoiceStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
