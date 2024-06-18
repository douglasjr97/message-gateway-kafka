package br.com.nerak.apipayment.service.kafka;

import br.com.nerak.apipayment.dto.InvoiceDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class InvoiceProducer {
    @Value("${spring.kafka.topic-invoice}")
    public String topic;
    private final KafkaTemplate<String, InvoiceDTO> kafkaTemplate;

    public InvoiceProducer(KafkaTemplate<String, InvoiceDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(InvoiceDTO invoice) {
        kafkaTemplate.send(topic, invoice);
    }
}
