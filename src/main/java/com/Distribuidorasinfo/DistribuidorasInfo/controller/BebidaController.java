package com.Distribuidorasinfo.DistribuidorasInfo.controller;

import com.Distribuidorasinfo.DistribuidorasInfo.dto.BebidaDTO;
import com.Distribuidorasinfo.DistribuidorasInfo.dto.BebidaDescontoDTO;
import com.Distribuidorasinfo.DistribuidorasInfo.mapper.BebidaMapper;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.DistribuidorasInfo.service.BebidaService;
import com.Distribuidorasinfo.api.controller.CrudController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${app.api.base}/bebida")
public class BebidaController extends CrudController
        <Bebida, BebidaDTO, Long, BebidaMapper, BebidaService>
{

    @Autowired
    private BebidaService bebidaService;

    @GetMapping(value = "/desconto")
    @Operation(description = "Listagem Geral", responses = {
            @ApiResponse(responseCode = "200", description = "Listagem geral",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema())),
            @ApiResponse(responseCode = "404", description = "Registro náo encontrado",
                    content = @Content(mediaType = "application/json"))
    })

    public ResponseEntity<BebidaDescontoDTO> obterDesconto(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "quantidade") int quantidade
    ) {

        return ResponseEntity.ok().body(this.bebidaService.obterBebidaDescontoDTO(id, quantidade));
    }



}
