package com.transporte.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "devoluciones")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Devolucion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private double cantidad;
    @NotBlank
    @Size(min = 1, max = 200)
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    private boolean estatus;
    @ManyToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;
}
