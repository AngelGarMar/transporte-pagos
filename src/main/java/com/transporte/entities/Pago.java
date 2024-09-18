package com.transporte.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private double costo;
    @NotBlank
    @Column(name = "iva")
    private double ivaCosto;
    @NotBlank
    private double total;
    @NotBlank
    private double recibi;
    @NotBlank
    private double devuelto;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    @Column(name = "estatus")
    private boolean estatus;
    @NotBlank
    private Long viajeId;
    @ManyToOne
    @JoinColumn(name = "iva_id")
    private Iva iva;
}
