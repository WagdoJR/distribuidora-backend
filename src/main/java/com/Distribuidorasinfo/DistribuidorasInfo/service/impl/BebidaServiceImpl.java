package com.Distribuidorasinfo.DistribuidorasInfo.service.impl;



import com.Distribuidorasinfo.DistribuidorasInfo.dto.BebidaDescontoDTO;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Desconto;
import com.Distribuidorasinfo.DistribuidorasInfo.repository.BebidaRepository;
import com.Distribuidorasinfo.DistribuidorasInfo.repository.DescontoRepository;
import com.Distribuidorasinfo.DistribuidorasInfo.service.BebidaService;
import com.Distribuidorasinfo.api.exception.BusinessException;
import com.Distribuidorasinfo.api.service.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.Distribuidorasinfo.DistribuidorasInfo.exception.SistemaMessageCode.ERRO_REGISTRO_NAO_ENCONTRADO;
import static com.Distribuidorasinfo.DistribuidorasInfo.exception.SistemaMessageCode.QUANIDADE_MENOR_QUE_O;

@Service
public class BebidaServiceImpl
        extends BaseCrudService<Bebida, Long, BebidaRepository>
        implements BebidaService {

    @Autowired
    private BebidaRepository bebidaRepository;

    @Autowired
    private DescontoRepository descontoRepository;

    @Override
    protected void prepararParaIncluir(Bebida entidade) {

    }

    @Override
    protected void validarDados(Bebida entidade) {

    }

    @Override
    protected void validarCamposObrigatorios(Bebida entidade) {

    }

    public BebidaDescontoDTO obterBebidaDescontoDTO(Long id, int quantidade) {
        if (quantidade <= 0) {
            throw new BusinessException(QUANIDADE_MENOR_QUE_O);
        }

        //pra não mudar o endereço de memória
        final Optional<Bebida> optionalBebida = bebidaRepository.findById(id);

        //Map serve para tranformar no inteiro de obterDesconto = descoto
        return optionalBebida
                .map(bebida -> this.obterDesconto(quantidade, bebida.getValorBebida()))
                .map(desconto ->
                        new BebidaDescontoDTO(
                                optionalBebida.get().getMarca(),
                                desconto,
                                (optionalBebida.get().getValorBebida() * quantidade) - desconto,
                                descontoRepository.save(
                                        new Desconto(
                                                quantidade,
                                                optionalBebida.get()
                                        )
                                ).getId()
                        )
                )
                .orElseThrow(() -> new BusinessException(ERRO_REGISTRO_NAO_ENCONTRADO));

    }

    private Integer obterDesconto(Integer quantidade, Integer valor) {
        if (quantidade < 10) {
            return 0;
        }

        return (int) (valor.doubleValue() * (quantidade.doubleValue() / 10));

    }

}
