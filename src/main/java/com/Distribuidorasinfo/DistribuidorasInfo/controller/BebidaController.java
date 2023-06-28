package com.Distribuidorasinfo.DistribuidorasInfo.controller;

import com.Distribuidorasinfo.DistribuidorasInfo.dto.BebidaDTO;
import com.Distribuidorasinfo.DistribuidorasInfo.mapper.BebidaMapper;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.DistribuidorasInfo.service.BebidaService;
import com.Distribuidorasinfo.api.controller.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${app.api.base}/bebida")
public class BebidaController extends CrudController
        <Bebida, BebidaDTO, Long, BebidaMapper, BebidaService>
{
}
