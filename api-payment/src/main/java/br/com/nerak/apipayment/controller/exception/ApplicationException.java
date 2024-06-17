package br.com.nerak.apipayment.controller.exception;

public class ApplicationException extends  RuntimeException{
    public ApplicationException(String message) {
        super(message);
    }
}
