package com.Distribuidorasinfo.DistribuidorasInfo.repository;

import com.Distribuidorasinfo.DistribuidorasInfo.model.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Long> {
}
