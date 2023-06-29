package com.Distribuidorasinfo.DistribuidorasInfo.model;

import com.Distribuidorasinfo.api.model.IEntidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table( name = "TBL_DESCONTO",
        uniqueConstraints = {
                @UniqueConstraint(name = Desconto.UK_DESCONTO_NAME, columnNames = {})
        }
)
@AllArgsConstructor
@NoArgsConstructor
public class Desconto implements IEntidade<Long> {

    public static final String UK_DESCONTO_NAME = "uk_desconto_name";

    @SequenceGenerator(
            name="a_gerador_sequence",
            sequenceName = "desconto_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "a_gerador_sequence"
    )
    @Id
    @Column(name = "id_desconto")
    private Long id;

    @Column(name = "Data")
    private  LocalDateTime data = LocalDateTime.now();

    @Column(name = "Quantidade")
    private  Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "id_bebida")
    private Bebida bebida;


    public Desconto(Integer quantidade, Bebida bebida) {
        this.quantidade = quantidade;
        this.bebida = bebida;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getTabelaNome() {
        return "Desconto";
    }

    public Long getId() {
        return id;
    }
}
