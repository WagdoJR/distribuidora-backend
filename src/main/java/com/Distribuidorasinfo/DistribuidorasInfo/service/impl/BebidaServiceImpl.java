package com.Distribuidorasinfo.DistribuidorasInfo.service.impl;

import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.DistribuidorasInfo.repository.BebidaRepository;
import com.Distribuidorasinfo.DistribuidorasInfo.service.BebidaService;
import com.Distribuidorasinfo.api.service.BaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class BebidaServiceImpl
        extends BaseCrudService<Bebida, Long, BebidaRepository>
        implements BebidaService {
    @Override
    protected void prepararParaIncluir(Bebida entidade) {

    }

    @Override
    protected void validarDados(Bebida entidade) {

    }

    @Override
    protected void validarCamposObrigatorios(Bebida entidade) {

    }
}
