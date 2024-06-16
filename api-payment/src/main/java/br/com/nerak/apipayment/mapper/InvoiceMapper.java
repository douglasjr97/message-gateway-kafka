package br.com.nerak.apipayment.mapper;
import br.com.nerak.apipayment.dto.InvoiceDTO;
import br.com.nerak.apipayment.entity.InvoiceEntity;
public class InvoiceMapper {

    public static InvoiceDTO toDTO(InvoiceEntity invoice){
        return InvoiceDTO.builder()
                .barCode(invoice.getBarCode())
                .invoiceStatus(invoice.getInvoiceStatus())
                .createdAt(invoice.getCreatedAt())
                .updatedAt(invoice.getUpdatedAt())
                .build();
    }
}
