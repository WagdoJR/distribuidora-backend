package com.Distribuidorasinfo.DistribuidorasInfo.service;

import com.Distribuidorasinfo.DistribuidorasInfo.dto.BebidaDescontoDTO;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.api.service.CrudService;

public interface BebidaService extends CrudService<Bebida, Long> {

    public BebidaDescontoDTO obterBebidaDescontoDTO(Long id, int quantidade);


}
