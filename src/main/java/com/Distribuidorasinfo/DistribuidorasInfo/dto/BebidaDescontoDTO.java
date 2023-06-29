package com.Distribuidorasinfo.DistribuidorasInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BebidaDescontoDTO {

    private final String marca;
    private final Integer valorDesconto;
    private final Integer valorTotal;
    private final Long numeroDesconto;

}
