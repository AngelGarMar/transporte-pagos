package com.transporte.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "pago_detalle")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PagoDetalle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private double cobro;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    @Column(name = "estatus")
    private int estatus;
    @ManyToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;
    @ManyToOne
    @JoinColumn(name = "tipo_pago_id")
    private TipoPago tipoPago;
}
