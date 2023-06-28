package com.Distribuidorasinfo.DistribuidorasInfo.exception;

import com.Distribuidorasinfo.api.exception.ApiRestResponseExceptionHandler;
import com.Distribuidorasinfo.api.exception.MessageCode;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Classe handler responsável por interceptar e tratar as exceções de forma
 * amigavel para o client.
 *
 * @author Squadra Tecnologia
 */
@ControllerAdvice
public class ResponseExceptionHandler extends ApiRestResponseExceptionHandler {
    /**
     * @see ApiRestResponseExceptionHandler#getCodeInternalServerError()
     */
    @Override
    protected MessageCode getCodeInternalServerError() {
        return SistemaMessageCode.ERRO_INESPERADO;
    }
}
