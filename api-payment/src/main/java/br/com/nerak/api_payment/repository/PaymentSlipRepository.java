package br.com.nerak.api_payment.repository;

import br.com.nerak.api_payment.entity.PaymentSlipEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentSlipRepository extends CrudRepository<PaymentSlipEntity, Long> {
    Optional<PaymentSlipEntity> findByBarCode(String barCode);
}
