package br.com.nerak.apipayment.service.kafka;

import br.com.nerak.apipayment.dto.InvoiceDTO;
import br.com.nerak.avro.Invoice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class InvoiceProducer {
    @Value("${spring.kafka.topic-invoice}")
    public String topic;
    private final KafkaTemplate<String, Invoice> kafkaTemplate;

    public InvoiceProducer(KafkaTemplate<String, Invoice> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Invoice invoice) {
        kafkaTemplate.send(topic, invoice);
    }
}
