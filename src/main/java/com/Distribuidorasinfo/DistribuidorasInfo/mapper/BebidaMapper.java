package com.Distribuidorasinfo.DistribuidorasInfo.mapper;

import com.Distribuidorasinfo.DistribuidorasInfo.dto.BebidaDTO;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.api.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BebidaMapper extends BaseMapper<Bebida, BebidaDTO> {
}
