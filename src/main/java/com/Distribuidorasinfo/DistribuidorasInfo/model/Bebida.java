package com.Distribuidorasinfo.DistribuidorasInfo.model;

import com.Distribuidorasinfo.api.model.IEntidade;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table( name = "TBL_BEBIDA",
        uniqueConstraints = {
                @UniqueConstraint(name= Bebida.UK_DISTRIBUIDORA_NAME, columnNames = Bebida.DISTRIBUIDORA_MARCA)
        }
)
public class Bebida implements IEntidade<Long> {
    public static final String UK_DISTRIBUIDORA_NAME = "uk_anime_name";
    public static final String DISTRIBUIDORA_MARCA = "nome";
    /*
    * Tipo bebida - String *
    * Marca da bebida - String *
    * Valor da bebida - INT *
    * ID da bebida - Long *
    * Categoria da bebida - String
    * */
    @SequenceGenerator(
            name="a_gerador_sequence",
            sequenceName = "anime_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "a_gerador_sequence"
    )
    @Id
    @Column(name = "CodigoBebida")
    private Long id;

    @Column(name = DISTRIBUIDORA_MARCA, nullable = false)
    private String marca;

    @Column(name = "ValorBebida", nullable = false)
    private Integer valorBebida;

    @Column(name = "TipoBebida", nullable = false)
    private String tipoBebida;

    @Column(name = "CategoriaBebida", nullable = false)
    private String categoriaBebida;

    @Override
    public String getTabelaNome() {
        return "Bebida";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bebida bebida = (Bebida) o;
        return id != null && Objects.equals(id, bebida.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
