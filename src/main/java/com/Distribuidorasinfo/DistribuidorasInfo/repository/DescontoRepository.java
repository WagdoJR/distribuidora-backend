package com.Distribuidorasinfo.DistribuidorasInfo.repository;

import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import com.Distribuidorasinfo.DistribuidorasInfo.model.Desconto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescontoRepository extends JpaRepository<Desconto, Long> {


}
