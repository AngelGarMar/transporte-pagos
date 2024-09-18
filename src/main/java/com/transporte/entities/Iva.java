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
@Table(name = "iva")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Iva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 1, max = 5)
    private String descripcion;
    @NotNull
    private float porcentaje;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    @Column(name = "estatus")
    private boolean estatus;
}
