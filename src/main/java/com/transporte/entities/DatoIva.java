package com.transporte.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "datos_iva")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DatoIva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 1, max = 100)
    private String direccion;
    @NotBlank
    @Size(min = 1, max = 15)
    private String rfc;
    @NotBlank
    @Size(min = 10, max = 10)
    private String telefono;
    @NotBlank
    @Size(min = 1, max = 45)
    private String email;
    @NotBlank
    @Size(min = 1, max = 45)
    private String uso;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    @Column(name = "estatus")
    private int estatus;
    @ManyToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;
}
