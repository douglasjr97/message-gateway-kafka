package br.com.nerak.apipayment.controller.exception;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    private String Error;
    private int code;
    private Date timestemp;
    private String path;
}
