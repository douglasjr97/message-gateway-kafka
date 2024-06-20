package br.com.nerak.apipayment.service;

import br.com.nerak.apipayment.controller.exception.ApplicationException;
import br.com.nerak.apipayment.dto.InvoiceDTO;
import br.com.nerak.apipayment.entity.InvoiceEntity;
import br.com.nerak.apipayment.entity.enums.InvoiceStatus;
import br.com.nerak.apipayment.mapper.InvoiceMapper;
import br.com.nerak.apipayment.repository.InvoiceRepository;
import br.com.nerak.apipayment.service.kafka.InvoiceProducer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceProducer invoiceProducer;

    public InvoiceService(InvoiceRepository invoiceRepository, InvoiceProducer invoiceProducer) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceProducer = invoiceProducer;
    }

    public InvoiceDTO save(String barcode){
        var optionalInvoice = invoiceRepository.findByBarCode(barcode);
        if (optionalInvoice.isPresent()){
            throw new ApplicationException("There's already a payment request for this invoice.");
        }

        var invoiceEntity = InvoiceEntity.builder()
                .barCode(barcode)
                .invoiceStatus(InvoiceStatus.INITIALIZED)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        invoiceRepository.save(invoiceEntity);
        invoiceProducer.sendMessage(InvoiceMapper.toAvro(invoiceEntity));
        return InvoiceMapper.toDTO(invoiceEntity);
    }

}
