package com.taller.taller.model;

import lombok.*;
import org.springframework.stereotype.Controller;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    int edad;
}
