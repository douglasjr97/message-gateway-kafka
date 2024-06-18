package br.com.nerak.apipayment.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceRequestDTO {

    @NotNull(message = "cannot be null")
    @NotEmpty(message = "cannot be null")
    private String barCode;
}
