package br.com.nerak.apipayment.controller;

import br.com.nerak.apipayment.dto.InvoiceDTO;
import br.com.nerak.apipayment.dto.InvoiceRequestDTO;
import br.com.nerak.apipayment.service.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    @PostMapping
    public ResponseEntity<InvoiceDTO> save(@Valid @RequestBody InvoiceRequestDTO invoiceRequestDTO){
        var invoice = invoiceService.save(invoiceRequestDTO.getBarCode());
        return new ResponseEntity<>(invoice, HttpStatus.CREATED);
    }
}
