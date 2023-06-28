package com.Distribuidorasinfo.DistribuidorasInfo.dto;

import lombok.Data;

public @Data class BebidaDTO {
    private Long id;
    private String marca;
    private Integer valorBebida;
    private String tipoBebida;
    private String categoriaBebida;
}
