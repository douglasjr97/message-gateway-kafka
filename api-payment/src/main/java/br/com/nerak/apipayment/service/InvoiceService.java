package br.com.nerak.apipayment.service;

import br.com.nerak.apipayment.dto.InvoiceDTO;
import br.com.nerak.apipayment.entity.InvoiceEntity;
import br.com.nerak.apipayment.entity.enums.InvoiceStatus;
import br.com.nerak.apipayment.mapper.InvoiceMapper;
import br.com.nerak.apipayment.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public InvoiceDTO save(String barcode){
        var optionalInvoice = invoiceRepository.findByBarCode(barcode);
        if (optionalInvoice.isPresent()){
            throw new RuntimeException("There's already a payment request for this invoice.");
        }

        var invoiceEntity = InvoiceEntity.builder()
                .barCode(barcode)
                .invoiceStatus(InvoiceStatus.INITIALIZED)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        invoiceRepository.save(invoiceEntity);
        return InvoiceMapper.toDTO(invoiceEntity);

    }

}
