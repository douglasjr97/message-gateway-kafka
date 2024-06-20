package br.com.nerak.apipayment.mapper;
import br.com.nerak.apipayment.dto.InvoiceDTO;
import br.com.nerak.apipayment.entity.InvoiceEntity;
import br.com.nerak.avro.Invoice;

public class InvoiceMapper {

    public static InvoiceDTO toDTO(InvoiceEntity invoice){
        return InvoiceDTO.builder()
                .barCode(invoice.getBarCode())
                .invoiceStatus(invoice.getInvoiceStatus())
                .createdAt(invoice.getCreatedAt())
                .updatedAt(invoice.getUpdatedAt())
                .build();
    }

    public static Invoice toAvro(InvoiceEntity invoice){
        return Invoice.newBuilder()
                .setBarCode(invoice.getBarCode())
                .setInvoiceStatus(invoice.getInvoiceStatus().ordinal())
                .build();
    }
}
