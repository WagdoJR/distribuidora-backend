package com.Distribuidorasinfo.DistribuidorasInfo.repository;

import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;

import java.util.List;

public interface BebidaRepositoryCustom {
    List<Bebida>localizarPorAnime(Bebida bebida);
}
