package br.com.nerak.apipayment.repository;

import br.com.nerak.apipayment.entity.InvoiceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceEntity, Long> {
    Optional<InvoiceEntity> findByBarCode(String barCode);
}
